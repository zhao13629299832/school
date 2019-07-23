package com.woniuxy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UserinfoMapper;
import com.woniuxy.entity.Userinfo;
import com.woniuxy.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{
	
	@Resource UserinfoMapper userinfoMapper;

	@Transactional(readOnly = true)
	public Userinfo login(Userinfo userinfo) {
		// TODO Auto-generated method stub
		return userinfoMapper.login(userinfo);
	}
	
}
