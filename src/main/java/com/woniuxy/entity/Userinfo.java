package com.woniuxy.entity;

import java.util.List;

public class Userinfo {
	private List roles;
	private List trees;
	
	
    @Override
	public String toString() {
		return "Userinfo [roles=" + roles + ", trees=" + trees + ", userPhone=" + userPhone + ", userPassword="
				+ userPassword + ", userName=" + userName + ", userIsdelete=" + userIsdelete + "]";
	}

	public List getRoles() {
		return roles;
	}

	public void setRoles(List roles) {
		this.roles = roles;
	}

	public List getTrees() {
		return trees;
	}

	public void setTrees(List trees) {
		this.trees = trees;
	}

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