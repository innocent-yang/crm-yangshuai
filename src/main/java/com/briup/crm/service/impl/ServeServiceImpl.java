package com.briup.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.crm.bean.CstService;
import com.briup.crm.bean.CstServiceExample;
import com.briup.crm.dao.CstServiceMapper;
import com.briup.crm.service.ServeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ServeServiceImpl implements ServeService {

	@Autowired
	private CstServiceMapper serviceMapper;
	
	@Override
	public PageInfo<CstService> findServiceByUserName(int curPage, int size, String userName) {
		//设置当前是哪一页，以及每页显示几条数据
		PageHelper.startPage(curPage,size);
		//查询所有信息
		CstServiceExample example = new CstServiceExample();
		example.createCriteria().andSvrDisposeEqualTo(userName);
		List<CstService> servicelist = serviceMapper.selectByExample(example);
		PageInfo<CstService> serviceInfo = new PageInfo<CstService>(servicelist);
		return serviceInfo;
	}

	@Override
	public PageInfo<CstService> findServiceLike(CstService service,int curPage,int size) {
		PageHelper.startPage(curPage,size);
		CstServiceExample example = new CstServiceExample();
		example.createCriteria().andSvrCustNameLike("%"+service.getSvrCustName()+"%")
		.andSvrTypeEqualTo(service.getSvrType())
		.andSvrDisposeEqualTo(service.getSvrDispose());
		
		List<CstService> servicelist = serviceMapper.selectByExample(example);
		PageInfo<CstService> serviceinfo = new PageInfo<CstService>(servicelist);
		return serviceinfo;
	}

	@Override
	public void saveOrUpdate(CstService service) {
		if(service.getSvrId()==null) {
			serviceMapper.insertSelective(service);
		}else {
			serviceMapper.updateByPrimaryKeySelective(service);
		}
	}

	@Override
	public CstService findServiceById(long servId) {
		CstService service = serviceMapper.selectByPrimaryKey(servId);
		return service;
	}

	@Override
	public PageInfo<CstService> findAllService(int curPage,int size) {
		PageHelper.startPage(curPage,size);
		CstServiceExample example = new CstServiceExample();
		List<CstService> list = serviceMapper.selectByExample(example);
		PageInfo<CstService> pageInfo = new PageInfo<CstService>(list);
		return pageInfo;
		
	}

	

}
