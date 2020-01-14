package com.briup.crm.web.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.crm.bean.CstService;
import com.briup.crm.bean.SysUser;
import com.briup.crm.service.ServeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/service")
public class ServiceController {

	@Autowired
	private ServeService serveService;
	
	@RequestMapping("/findServiceByUserName/{curPage}")
	public String findServiceByUserName(@PathVariable int curPage,HttpSession session) {
		SysUser user = (SysUser) session.getAttribute("user");
		PageInfo<CstService> serveInfo = serveService.findServiceByUserName(curPage, 5, user.getUsrName());
		session.setAttribute("serveInfo", serveInfo);
		return "service/service";
	}
	
	@RequestMapping("/findServiceLike/{curPage}")
	public String findServiceLike(@PathVariable int curPage,CstService serve,HttpSession session) {
		SysUser user = (SysUser) session.getAttribute("user");
		serve.setSvrDispose(user.getUsrName());
		PageInfo<CstService> serveInfo = serveService.findServiceLike(serve, curPage, 5);
		session.setAttribute("serveInfo", serveInfo);
		return "service/serviceLike";
	}
	
	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public String saveOrUpdate(CstService service) {
		serveService.saveOrUpdate(service);
		return "保存成功";
	}
	
	@RequestMapping("/findServiceById/{servId}")
	@ResponseBody
	public CstService findServiceById(@PathVariable long servId) {
		CstService service = serveService.findServiceById(servId);
		return service;
	}
	
	@RequestMapping("/toServiceDetail/{servId}")
	public String toServiceDetail(@PathVariable long servId,HttpSession session) {
		CstService service = serveService.findServiceById(servId);
		session.setAttribute("service", service);
		return "service/serviceDetails";
	}
	
	@RequestMapping("/findAllService/{curPage}")
	public String findAllService(@PathVariable int curPage,HttpSession session) {
		PageInfo<CstService> services = serveService.findAllService(curPage, 5);
		session.setAttribute("services", services);
		return "service/feedback";
		
	}
}
