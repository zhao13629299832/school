package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.PageBean;
import com.woniuxy.entity.Userinfo;

public interface IUserinfoService {
	public void save(Userinfo userinfo,Integer[] roleIds);
	public void delete(String userPhone);
	public void update(Userinfo userinfo,Integer[] roleIds);
	public List findAll(Userinfo userinfo,PageBean page);
	public Userinfo findById(String userPhone);
}
