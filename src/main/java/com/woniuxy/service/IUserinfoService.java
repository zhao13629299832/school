package com.woniuxy.service;

import java.util.List;

import com.woniuxy.entity.Userinfo;

public interface IUserinfoService {
	public void save(Userinfo userinfo,Integer[] roleIds);
	public void delete(String userPhone);
	public void update(Userinfo userinfo,Integer[] roleIds);
	public List findAll();
	public Userinfo findById(String userPhone);
}
