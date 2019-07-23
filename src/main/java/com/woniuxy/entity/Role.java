package com.woniuxy.entity;

public class Role {
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