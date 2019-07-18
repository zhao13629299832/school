package com.woniuxy.entity;

public class Post {
    private String postId;

    private String userPhone;

    private String postName;

    private String postContent;

    private String postPhoto;

    private Boolean postIsdelete;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostPhoto() {
        return postPhoto;
    }

    public void setPostPhoto(String postPhoto) {
        this.postPhoto = postPhoto;
    }

    public Boolean getPostIsdelete() {
        return postIsdelete;
    }

    public void setPostIsdelete(Boolean postIsdelete) {
        this.postIsdelete = postIsdelete;
    }
}