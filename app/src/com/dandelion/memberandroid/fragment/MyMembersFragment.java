package com.dandelion.memberandroid.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.dandelion.memberandroid.R;
import com.dandelion.memberandroid.adapter.MyMembersListAdapter;
import com.dandelion.memberandroid.constant.LoggerConstant;
import com.dandelion.memberandroid.constant.QiNiuConstant;
import com.dandelion.memberandroid.model.MemberDataResponse;
import com.dandelion.memberandroid.model.MemberListResponse;
import com.dandelion.memberandroid.model.MyMembersPO;
import com.dandelion.memberandroid.model.NotificationDataResponse;
import com.dandelion.memberandroid.model.NotificationMessagePO;
import com.dandelion.memberandroid.service.AccountService;
import com.dandelion.memberandroid.volley.MemberappApi;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyMembersFragment extends Fragment {
    private Gson gson;
    private MyMembersListAdapter myMembersListAdapter;

    //VALUE
    private String sid;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_members, container, false);
    }

    @Override
    public void onStart() {
        getMyMembersData();
        gson = new Gson();
        myMembersListAdapter = new MyMembersListAdapter(getActivity());
        ListView listView = (ListView) getActivity().findViewById(R.id.my_members_list);
        listView.setAdapter(myMembersListAdapter);
        listView.setFastScrollEnabled(true);
        super.onStart();
    }

    public void getMyMembersData() {
        AccountService service = new AccountService(getActivity());
        sid = service.getAuthAccount().getSid();
        MemberappApi.getMyMembers(sid, getMyMembersListener, getMyMembersErrorListener);
    }

    private Response.Listener<String> getMyMembersListener = new Response.Listener<String>() {

        @Override
        public void onResponse(String response) {
            Log.d(LoggerConstant.VOLLEY_REQUEST, response);
            List<MyMembersPO> data = new ArrayList<MyMembersPO>();
            List<MemberDataResponse> memberList =
                    gson.fromJson(response, MemberListResponse.class).getMemberList();
            for (MemberDataResponse memberDataResponse : memberList) {
                MyMembersPO member = new MyMembersPO();
                member.setAvatarUrl(
                        QiNiuConstant.getImageDownloadURL(memberDataResponse.getAvatarurl()));
                member.setMember(true);
                member.setScore(Long.valueOf(new Random().nextInt()));
                member.setName(memberDataResponse.getName());
                data.add(member);
            }
            myMembersListAdapter.swapItems(data);

        }
    };
    private Response.ErrorListener getMyMembersErrorListener = new Response.ErrorListener() {

        @Override
        public void onErrorResponse(VolleyError error) {
        }
    };
}
