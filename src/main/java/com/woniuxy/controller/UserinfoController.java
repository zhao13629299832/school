package com.woniuxy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.entity.Userinfo;
import com.woniuxy.service.IRoleService;
import com.woniuxy.service.IUserinfoService;
import com.woniuxy.tools.MD5;

@Controller
@RequestMapping("/admin/userinfo/")
public class UserinfoController {

	@Resource
	private IUserinfoService userinfoServiceImpl;
	@Resource
	private IRoleService roleServiceImpl;
	
	@RequestMapping("save")
	public String save(Userinfo userinfo,Integer[] roleIds) {
		userinfo.setUserPassword(MD5.md5s(userinfo.getUserPassword()));
		userinfoServiceImpl.save(userinfo, roleIds);
		return "rediect:findAll";
	}
	
	@RequestMapping("delete")
	public String delete(String userPhone) {
		userinfoServiceImpl.delete(userPhone);
		return "redirect:findAll";
	}
	
	@RequestMapping("update")
	public String update(Userinfo userinfo,Integer[] roleIds) {
		userinfo.setUserPassword(MD5.md5s(userinfo.getUserPassword()));
		userinfoServiceImpl.update(userinfo, roleIds);
		return "redirect:findAll";
	}
	
	@RequestMapping("findAll")
	public String findAll(ModelMap map) {
		List list=userinfoServiceImpl.findAll();
		map.put("lidt",list);
		return "admin/userinfo/list";
	}
	
	@RequestMapping("findById")
	public String findById(String userPhone,ModelMap map) {
		Userinfo info=userinfoServiceImpl.findById(userPhone);
		map.put("info", info);
		return "forword:goInput";
	}
	
	@RequestMapping("goInput")
	public String goInput(ModelMap map) {
		List list=roleServiceImpl.findAll();
		map.put("roles", list);
		return "admin/userinfo/input";
	}
}
