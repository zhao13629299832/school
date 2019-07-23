package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.RoleMapper;
import com.woniuxy.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService{

	@Resource
	private RoleMapper roleMapper;
	
	@Transactional(readOnly = true)
	public List findAll() {
		return roleMapper.selectByExample(null);
	}

}
