package com.woniuxy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniuxy.entity.Userinfo;
import com.woniuxy.service.ILoginService;
import com.woniuxy.tools.MD5;


@Controller
public class LoginController {

	@Resource
	private ILoginService loginServiceImpl;
	
	@RequestMapping("login")
	public String login(Userinfo info,ModelMap map,HttpSession session) throws Exception {
//		if(info.getUserPassword()!=null) {
//			info.setUserPassword(MD5.md5s(info.getUserPassword()));
//		}
//		Userinfo foo=loginServiceImpl.login(info);
//			if(foo==null) {
//				map.put("error", "输入账号或密码错误");
//				return "login";
//			}else {
//				ObjectMapper objectMapper=new ObjectMapper();
//				String json=objectMapper.writeValueAsString(foo.getTrees());
//				session.setAttribute("json", json);
//				session.setAttribute("info", info);
//				return "redirect:/admin/index.jsp";
//			}
			if(info.getUserPassword()!=null)
				info.setUserPassword(MD5.md5s(info.getUserPassword()));
			info = loginServiceImpl.login(info);
			if(info==null) {
				map.put("error", "用户名密码不正确");
				return "index";
			}else {
				ObjectMapper objectMapper = new ObjectMapper();
				String json = objectMapper.writeValueAsString(info.getTrees());
				session.setAttribute("json", json);
				session.setAttribute("info", info);
				return "redirect:/admin/index.jsp";
			}
	}
}
