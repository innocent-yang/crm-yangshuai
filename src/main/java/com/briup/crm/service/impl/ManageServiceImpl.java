package com.briup.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.crm.bean.SysRole;
import com.briup.crm.bean.SysRoleExample;
import com.briup.crm.bean.SysUser;
import com.briup.crm.bean.SysUserExample;
import com.briup.crm.dao.SysRoleMapper;
import com.briup.crm.dao.SysUserMapper;
import com.briup.crm.service.ManageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ManageServiceImpl implements ManageService {

	@Autowired
	private SysRoleMapper sysRoleMapper;
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public List<SysRole> findAllRole() {
		SysRoleExample example = new SysRoleExample();
		List<SysRole> rolelist = sysRoleMapper.selectByExample(example);
		return rolelist;
	}

	@Override
	public PageInfo<SysRole> findAllRoleByPage(int curPage, int size) {
		//设置当前是哪一页，以及每页显示几条数据
		PageHelper.startPage(curPage,size);
		SysRoleExample example = new SysRoleExample();
		List<SysRole> rolelist = sysRoleMapper.selectByExample(example);
		PageInfo<SysRole> roleinfo = new PageInfo<SysRole>(rolelist);
		return roleinfo;
	}

	@Override
	public void saveOrUpdateRole(SysRole role) {
		//判断id是否为空 若为空是保存，否者是更新操作
		if(role.getRoleId()==null) {
			sysRoleMapper.insert(role);
		}else {
			sysRoleMapper.updateByPrimaryKey(role);
		}
	}

	@Override
	public void deleteRoleById(long roleId) {
		sysRoleMapper.deleteByPrimaryKey(roleId);
	}
	
	@Override
	public SysRole findRoleById(long roleId) {
		SysRole role = sysRoleMapper.selectByPrimaryKey(roleId);
		return role;
	}
	
	@Override
	public PageInfo<SysUser> findAllUserByPage(int curPage, int size) {
		//设置当前是哪一页，以及每页显示几条数据
		PageHelper.startPage(curPage,size);
		SysUserExample example = new SysUserExample();
		List<SysUser> userlist = sysUserMapper.selectByExample(example);
		PageInfo<SysUser> userinfo = new PageInfo<SysUser>(userlist);
		return userinfo;
	}

	@Override
	public void saveOrUpdateUser(SysUser user) {
		//判断id是否为空 若为空是保存，否者是更新操作
		if(user.getUsrId()==null) {
			sysUserMapper.insert(user);
		}else {
			sysUserMapper.updateByPrimaryKey(user);
		}
	}

	@Override
	public void deleteUserById(long userId) {
		sysUserMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public SysUser findUserById(long userId) {
		SysUser user = sysUserMapper.selectByPrimaryKey(userId);
		return user;
	}

	@Override
	public PageInfo<SysUser> findUserByUserRoleId(int curPage, int size, Long userRoleId) {
		//设置当前是哪一页，以及每页显示几条数据
		PageHelper.startPage(curPage,size);
		SysUserExample example = new SysUserExample();
		example.createCriteria().andUsrRoleIdEqualTo(userRoleId);
		List<SysUser> userlist = sysUserMapper.selectByExample(example);
		PageInfo<SysUser> userinfo = new PageInfo<SysUser>(userlist);
		return userinfo;
	}

	@Override
	public PageInfo<SysUser> findUserByUserRoleName(int curPage, int size, String userRoleName) {
		PageHelper.startPage(curPage,size);
		SysUserExample example = new SysUserExample();
		example.createCriteria().andUsrRoleNameEqualTo(userRoleName);
		List<SysUser> userlist = sysUserMapper.selectByExample(example);
		PageInfo<SysUser> userinfo = new PageInfo<SysUser>(userlist);
		return userinfo;
	}

	

	

}
