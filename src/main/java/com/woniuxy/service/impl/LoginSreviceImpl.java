package com.woniuxy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UserinfoMapper;
import com.woniuxy.entity.Userinfo;
import com.woniuxy.service.ILoginSrevice;

@Service
public class LoginSreviceImpl implements ILoginSrevice{
	
	@Resource UserinfoMapper userinfoMapper;

	@Transactional(readOnly = true)
	public Userinfo login(Userinfo userinfo) {
		// TODO Auto-generated method stub
		return userinfoMapper.login(userinfo);
	}
	
}
