package com.woniuxy.entity;

public class Friend {
    private String firendId;

    private String friendPhone;

    private String userPhone;

    private String friendSessionId;

    private Boolean friendIsdelete;

    public String getFirendId() {
        return firendId;
    }

    public void setFirendId(String firendId) {
        this.firendId = firendId;
    }

    public String getFriendPhone() {
        return friendPhone;
    }

    public void setFriendPhone(String friendPhone) {
        this.friendPhone = friendPhone;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getFriendSessionId() {
        return friendSessionId;
    }

    public void setFriendSessionId(String friendSessionId) {
        this.friendSessionId = friendSessionId;
    }

    public Boolean getFriendIsdelete() {
        return friendIsdelete;
    }

    public void setFriendIsdelete(Boolean friendIsdelete) {
        this.friendIsdelete = friendIsdelete;
    }
}