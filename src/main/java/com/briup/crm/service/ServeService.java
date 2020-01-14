package com.briup.crm.service;


import com.briup.crm.bean.CstService;
import com.github.pagehelper.PageInfo;

public interface ServeService {
	public PageInfo<CstService> findServiceByUserName(int curPage,int size,String userName);
	
	public PageInfo<CstService> findServiceLike(CstService service,int curPage,int size);
	
	public void saveOrUpdate(CstService service);
	
	public CstService findServiceById(long servId);
	
	public PageInfo<CstService> findAllService(int curPage,int size);
}
