package com.woniuxy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UserinfoMapper;
import com.woniuxy.dao.UserinforoleMapper;
import com.woniuxy.entity.Userinfo;
import com.woniuxy.entity.UserinforoleExample;
import com.woniuxy.entity.UserinforoleKey;
import com.woniuxy.service.IUserinfoService;

@Service
public class UserinfoServiceImpl implements IUserinfoService {

	@Resource
	private UserinfoMapper userinfoMapper;
	@Resource
	private UserinforoleMapper userinforoleMapper;
	
	@Transactional
	public void save(Userinfo userinfo,Integer[] roleIds) {
		userinfoMapper.insert(userinfo);
		if(roleIds!=null)
			for(int i=0;i<roleIds.length;i++) {
				UserinforoleKey key=new UserinforoleKey();
				key.setUserPhone(userinfo.getUserPhone());
				key.setRoleId(roleIds[i]);
				userinforoleMapper.insert(key);
			}
	}

	@Transactional
	public void delete(String userPhone) {
		Userinfo userinfo=new Userinfo();
		userinfo.setUserPhone(userPhone);
		userinfo.setUserIsdelete(true);
		userinfoMapper.updateByPrimaryKeySelective(userinfo);
		

	}

	@Transactional
	public void update(Userinfo userinfo,Integer[] roleIds) {
		userinfoMapper.updateByPrimaryKeySelective(userinfo);
		UserinforoleExample example=new UserinforoleExample();
		example.createCriteria().andUserPhoneEqualTo(userinfo.getUserPhone());
		userinforoleMapper.deleteByExample(example);
		if(roleIds!=null)
			for(int i=0;i<roleIds.length;i++) {
				UserinforoleKey key=new UserinforoleKey();
				key.setUserPhone(userinfo.getUserPhone());
				key.setRoleId(roleIds[i]);
				userinforoleMapper.insert(key);
			}
	}

	@Transactional(readOnly = true)
	public List findAll() {
		return userinfoMapper.selectByExample(null);
	}

	@Transactional(readOnly = true)
	public Userinfo findById(String userPhone) {
		return userinfoMapper.selectByPrimaryKey(userPhone);
	}


}
