package com.briup.crm.service;

import java.util.List;

import com.briup.crm.bean.SysRole;
import com.briup.crm.bean.SysUser;
import com.github.pagehelper.PageInfo;

public interface ManageService {
	public List<SysRole> findAllRole();
	
	public PageInfo<SysRole> findAllRoleByPage(int curPage,int size);
	
	public void saveOrUpdateRole(SysRole role);
	
	public void deleteRoleById(long roleId);
	
	public SysRole findRoleById(long roleId);
	
	public PageInfo<SysUser> findAllUserByPage(int curPage,int size);
	
	public void saveOrUpdateUser(SysUser user);
	
	public void deleteUserById(long userId);
	
	public SysUser findUserById(long userId);
	
	public PageInfo<SysUser> findUserByUserRoleId(int curPage,int size,Long userRoleId);
	
	public PageInfo<SysUser> findUserByUserRoleName(int curPage,int size,String userRoleName);
}
