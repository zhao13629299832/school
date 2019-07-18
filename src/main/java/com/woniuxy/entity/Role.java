package com.woniuxy.entity;

public class Role {
    private Integer roleId;

    private Integer roleName;

    private Boolean roleIsdelete;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleName() {
        return roleName;
    }

    public void setRoleName(Integer roleName) {
        this.roleName = roleName;
    }

    public Boolean getRoleIsdelete() {
        return roleIsdelete;
    }

    public void setRoleIsdelete(Boolean roleIsdelete) {
        this.roleIsdelete = roleIsdelete;
    }
}