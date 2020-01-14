package com.briup.crm.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.briup.crm.bean.SysRole;
import com.briup.crm.bean.SysUser;
import com.briup.crm.dao.SysUserMapper;
import com.briup.crm.service.ManageService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/manage")
public class ManageController {
	@Autowired
	private ManageService manageService;
	
	@RequestMapping("/findAllRoleByPage/{curPage}")
	public String findAllRoleByPage(@PathVariable int curPage,HttpSession session) {
		PageInfo<SysRole> roleinfo = manageService.findAllRoleByPage(curPage, 5);
		session.setAttribute("roleinfo", roleinfo);
		return "manage/role";
	}
	
	@RequestMapping("/saveOrUpdateRole")
	@ResponseBody
	public String saveOrUpdateRole(SysRole role) {
		manageService.saveOrUpdateRole(role);
		return "保存成功";
	}
	
	@RequestMapping("/deleteRoleById/{roleId}")
	@ResponseBody
	public String deleteRoleById(@PathVariable long roleId) {
		manageService.deleteRoleById(roleId);
		return "删除成功";
	}
	
	@RequestMapping("/findRoleById/{roleId}")
	@ResponseBody
	public SysRole findRoleById(@PathVariable long roleId) {
		SysRole role = manageService.findRoleById(roleId);
		return  role;
	}
	
	@RequestMapping("/findAllUserByPage/{curPage}")
	public String findAllUserByPage(@PathVariable int curPage,HttpSession session) {
		PageInfo<SysUser> userinfo = manageService.findAllUserByPage(curPage, 5);
		session.setAttribute("userinfo", userinfo);
		return "manage/user";
	}
	
	@RequestMapping("/saveOrUpdateUser")
	@ResponseBody
	public String saveOrUpdateUser(SysUser user) {
		manageService.saveOrUpdateUser(user);
		return "保存成功";
	}
	
	@RequestMapping("/deleteUserById/{userId}")
	@ResponseBody
	public String deleteUserById(@PathVariable long userId) {
		manageService.deleteUserById(userId);
		return "删除成功";
	}
	
	@RequestMapping("/findUserById/{userId}")
	@ResponseBody
	public SysUser findUserById(@PathVariable long userId) {
		SysUser user = manageService.findUserById(userId);
		return  user;
	}
	
	@RequestMapping("/findUserByUserRoleId/{curPage}")
	public String findUserByUserRoleId(@PathVariable int curPage,Long usrRoleId,HttpSession session) {
		PageInfo<SysUser> userinfo = manageService.findUserByUserRoleId(curPage, 5, usrRoleId);
		session.setAttribute("userinfo", userinfo);
		return "manage/user";
	}
	
	@RequestMapping("/findUserByUserRoleName/{curPage}")
	public String findUserByUserRoleName(@PathVariable int curPage,String userRoleName,HttpSession session) {
		PageInfo<SysUser> userinfo = manageService.findUserByUserRoleName(curPage, 5, userRoleName);
		session.setAttribute("userinfo", userinfo);
		return "manage/user";
	}
}
