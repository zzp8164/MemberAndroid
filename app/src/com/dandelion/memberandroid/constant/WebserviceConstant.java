package com.dandelion.memberandroid.constant;

import com.android.volley.Request.Method;

public class WebserviceConstant {
//	public static final String HOST = "http://memberappwebservice.duapp.com";
	public static final String HOST = "http://112.124.99.204/indefensible-membership";

	
	public static final String REGISTER_URI = HOST + "/Register";
	public static final int REGISTER_METHOD = Method.POST;
	
	
	public static final String LOGIN_URI = HOST + "/Login";
	public static final int LOGIN_METHOD = Method.POST;

    public static final String MERCHANT_URI = HOST + "/Merchants";
    public static final String MEMBER_URI = HOST + "/Members";

    public static final String CHANGE_PASSWORD_URI = HOST + "/ChangePassword";

    public static final String FRIENDS_URI = HOST + "/Friends";

    public static final String FEED_URI = HOST + "/Feeds";

    public static final String TIMELINE_URI = HOST + "/Timeline";

    public static final String MY_POSTS_URI = HOST + "/MyPosts";

    public static final String MERCHANT_POSTS_URI = HOST + "/MerchantPosts";

    public static final String NOTIFICATION_URI = HOST + "/Notifications";

    public static final String MY_MEMBERS_URI = HOST + "/MyMembers";

    public static final String MY_MERCHANTS_URI = HOST + "/MyMerchants";

    public static String PACKAGE_NAME = "com.dandelion.memberandroid";






	public static final int ACCOUNT_TYPE_MERCHANT = 1;
	public static final int ACCOUNT_TYPE_MEMBER = 0;



    public static final String STAR = "*";
}
