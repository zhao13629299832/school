package com.woniuxy.entity;

import java.util.Date;

public class FriendSession {
    private String friendSessionId;

    private String firendId;

    private Date friendSessionTime;

    private String friendSessionFromid;

    private String friendSessionToid;

    private Boolean friendSessionIsdelete;

    private String friendSessionMessage;

    public String getFriendSessionId() {
        return friendSessionId;
    }

    public void setFriendSessionId(String friendSessionId) {
        this.friendSessionId = friendSessionId;
    }

    public String getFirendId() {
        return firendId;
    }

    public void setFirendId(String firendId) {
        this.firendId = firendId;
    }

    public Date getFriendSessionTime() {
        return friendSessionTime;
    }

    public void setFriendSessionTime(Date friendSessionTime) {
        this.friendSessionTime = friendSessionTime;
    }

    public String getFriendSessionFromid() {
        return friendSessionFromid;
    }

    public void setFriendSessionFromid(String friendSessionFromid) {
        this.friendSessionFromid = friendSessionFromid;
    }

    public String getFriendSessionToid() {
        return friendSessionToid;
    }

    public void setFriendSessionToid(String friendSessionToid) {
        this.friendSessionToid = friendSessionToid;
    }

    public Boolean getFriendSessionIsdelete() {
        return friendSessionIsdelete;
    }

    public void setFriendSessionIsdelete(Boolean friendSessionIsdelete) {
        this.friendSessionIsdelete = friendSessionIsdelete;
    }

    public String getFriendSessionMessage() {
        return friendSessionMessage;
    }

    public void setFriendSessionMessage(String friendSessionMessage) {
        this.friendSessionMessage = friendSessionMessage;
    }
}