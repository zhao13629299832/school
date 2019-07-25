package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Role;
import com.woniuxy.entity.Userinfo;

public interface IRoleService {
	public List findAll();
	public void save(Role role,String ids);
	public void update(Role role,String ids);
	public Role findById(Integer roleId);
}
