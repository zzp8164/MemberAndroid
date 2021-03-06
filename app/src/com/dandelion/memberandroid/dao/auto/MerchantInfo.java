package com.dandelion.memberandroid.dao.auto;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table MERCHANT_INFO.
 */
public class MerchantInfo {

    private Long id;
    /** Not-null value. */
    private String avatarurl;
    /** Not-null value. */
    private String name;
    /** Not-null value. */
    private String address;
    private String phone;
    private String email;
    private String merchanttype;
    private String introduction;
    private boolean namerequired;
    private boolean sexrequired;
    private boolean phonerequired;
    private boolean addressrequired;
    private boolean emailrequired;
    private boolean birthdayrequired;
    private boolean membersetting;
    private boolean scoreplan;
    private Integer amountrequired;
    private Integer amountcountrequired;
    private long useridfk;
    /** Not-null value. */
    private java.util.Date createdDate;
    /** Not-null value. */
    private java.util.Date modifyDate;

    public MerchantInfo() {
    }

    public MerchantInfo(Long id) {
        this.id = id;
    }

    public MerchantInfo(Long id, String avatarurl, String name, String address, String phone, String email, String merchanttype, String introduction, boolean namerequired, boolean sexrequired, boolean phonerequired, boolean addressrequired, boolean emailrequired, boolean birthdayrequired, boolean membersetting, boolean scoreplan, Integer amountrequired, Integer amountcountrequired, long useridfk, java.util.Date createdDate, java.util.Date modifyDate) {
        this.id = id;
        this.avatarurl = avatarurl;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.merchanttype = merchanttype;
        this.introduction = introduction;
        this.namerequired = namerequired;
        this.sexrequired = sexrequired;
        this.phonerequired = phonerequired;
        this.addressrequired = addressrequired;
        this.emailrequired = emailrequired;
        this.birthdayrequired = birthdayrequired;
        this.membersetting = membersetting;
        this.scoreplan = scoreplan;
        this.amountrequired = amountrequired;
        this.amountcountrequired = amountcountrequired;
        this.useridfk = useridfk;
        this.createdDate = createdDate;
        this.modifyDate = modifyDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getAvatarurl() {
        return avatarurl;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    /** Not-null value. */
    public String getAddress() {
        return address;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMerchanttype() {
        return merchanttype;
    }

    public void setMerchanttype(String merchanttype) {
        this.merchanttype = merchanttype;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public boolean getNamerequired() {
        return namerequired;
    }

    public void setNamerequired(boolean namerequired) {
        this.namerequired = namerequired;
    }

    public boolean getSexrequired() {
        return sexrequired;
    }

    public void setSexrequired(boolean sexrequired) {
        this.sexrequired = sexrequired;
    }

    public boolean getPhonerequired() {
        return phonerequired;
    }

    public void setPhonerequired(boolean phonerequired) {
        this.phonerequired = phonerequired;
    }

    public boolean getAddressrequired() {
        return addressrequired;
    }

    public void setAddressrequired(boolean addressrequired) {
        this.addressrequired = addressrequired;
    }

    public boolean getEmailrequired() {
        return emailrequired;
    }

    public void setEmailrequired(boolean emailrequired) {
        this.emailrequired = emailrequired;
    }

    public boolean getBirthdayrequired() {
        return birthdayrequired;
    }

    public void setBirthdayrequired(boolean birthdayrequired) {
        this.birthdayrequired = birthdayrequired;
    }

    public boolean getMembersetting() {
        return membersetting;
    }

    public void setMembersetting(boolean membersetting) {
        this.membersetting = membersetting;
    }

    public boolean getScoreplan() {
        return scoreplan;
    }

    public void setScoreplan(boolean scoreplan) {
        this.scoreplan = scoreplan;
    }

    public Integer getAmountrequired() {
        return amountrequired;
    }

    public void setAmountrequired(Integer amountrequired) {
        this.amountrequired = amountrequired;
    }

    public Integer getAmountcountrequired() {
        return amountcountrequired;
    }

    public void setAmountcountrequired(Integer amountcountrequired) {
        this.amountcountrequired = amountcountrequired;
    }

    public long getUseridfk() {
        return useridfk;
    }

    public void setUseridfk(long useridfk) {
        this.useridfk = useridfk;
    }

    /** Not-null value. */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /** Not-null value. */
    public java.util.Date getModifyDate() {
        return modifyDate;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setModifyDate(java.util.Date modifyDate) {
        this.modifyDate = modifyDate;
    }

}
