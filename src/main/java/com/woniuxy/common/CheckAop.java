package com.woniuxy.common;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.woniuxy.entity.Tree;
import com.woniuxy.entity.Userinfo;

@Aspect
@Component
public class CheckAop {
	@Around("execution(* com.woniuxy.controller.*.*(..))")
	public Object check(ProceedingJoinPoint p) throws Throwable {
		boolean issuccess = false;
		//request怎么来
		ServletRequestAttributes srq = 
		(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		
		//1 获取当前的请求路径
		String url = srq.getRequest().getServletPath();
		if(url.equals("/login")) {//登录
			Object obj = p.proceed();
			return obj;
		}else {
			//把请求地址最后一个/后面的代码去了
			if(url.indexOf("/")!=-1) {
				url = url.substring(0, url.lastIndexOf("/"));
				url = url.replace("/admin/", "");
			}
			
			System.out.println("=================>"+url);
			
			//2
			Userinfo info = (Userinfo)srq.getRequest().getSession().getAttribute("info");
			List<Tree> list = info.getTrees();
			System.out.println(list);
			for (Tree tree : list) {
				if(tree.getTreeFile()!=null) {
					String temp = tree.getTreeFile().substring(0,tree.getTreeFile().lastIndexOf("/"));
					System.out.println(temp+"    "+url);
					if(temp.equals(url)) {
						issuccess = true;
						break;
					}
				}
			}
			
			if(issuccess) {
				Object obj = p.proceed();
				return obj;
			}else {
				//ModelAndView mv = new ModelAndView();
				//mv.setViewName("redirect:../index.jsp");
				return "redirect:../../login.jsp";
			}
		}
	}
}
