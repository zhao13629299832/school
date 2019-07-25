package com.woniuxy.entity;

import java.util.List;

public class Role {
	private List trees;
	
    public List getTrees() {
		return trees;
	}

	public void setTrees(List trees) {
		this.trees = trees;
	}

	private Integer roleId;

    private String roleName;

    private Boolean roleIsdelete;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Boolean getRoleIsdelete() {
        return roleIsdelete;
    }

    public void setRoleIsdelete(Boolean roleIsdelete) {
        this.roleIsdelete = roleIsdelete;
    }

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleIsdelete=" + roleIsdelete + "]";
	}
    
}