package com.woniuxy.entity;

public class Userinfo {
    private String userPhone;

    private String userPassword;

    private String userName;

    private Boolean userIsdelete;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getUserIsdelete() {
        return userIsdelete;
    }

    public void setUserIsdelete(Boolean userIsdelete) {
        this.userIsdelete = userIsdelete;
    }
}