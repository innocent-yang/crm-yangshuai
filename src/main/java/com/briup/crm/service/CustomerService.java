package com.briup.crm.service;

import java.util.List;
import java.util.Set;

import com.briup.crm.bean.CstCustomer;
import com.github.pagehelper.PageInfo;

public interface CustomerService {
	public List<CstCustomer> findAllCustomer();
	
	public PageInfo<CstCustomer> findAllCustomerByPage(int curPage,int size);
	
	public void saveOrUpdateCustomer(CstCustomer customer);
	
	public void deleteCustomerById(long custId);
	
	public CstCustomer findCustomerById(long custId);
	
	public PageInfo<CstCustomer> findCustomerLike(int curPage,int size,CstCustomer customer);
	
	public float getRegionPercent(String region);
	
	//查询所有的等级
	public Set<String> findAllLevel();
	
	//查询所有的信誉度
	public Set<Integer> findAllCredit();
	
	//查询所有的满意度
	public Set<Integer> findAllSatisfy();
	
	//查询不同等级的顾客的人数
	public int getCustByLevel(String level);
	
	//查询不同信誉度的顾客的人数
	public int getCustByCredit(int credit);
	
	//查询不同满意度的顾客的人数
	public int getCustBySatisfy(int satisfy);
	
}
