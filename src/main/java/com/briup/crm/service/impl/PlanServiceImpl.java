package com.briup.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.crm.bean.SalChance;
import com.briup.crm.bean.SalPlan;
import com.briup.crm.dao.SalChanceMapper;
import com.briup.crm.dao.SalPlanMapper;
import com.briup.crm.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	private SalPlanMapper planMapper;
	@Autowired
	private SalChanceMapper chanceMapper;
	@Override
	public void savaPlan(SalPlan plan, long chanceId) {
		planMapper.insertSelective(plan);
		//根据chanceID查询销售商机
		SalChance chance = chanceMapper.selectByPrimaryKey(chanceId);
		chance.setChcStatus(2);
		chanceMapper.updateByPrimaryKey(chance);
	}
	
	@Override
	public void saveOrUpdate(SalPlan plan) {
		if(plan.getPlaId()==null) {
			planMapper.insertSelective(plan);
		}else {
			planMapper.updateByPrimaryKeySelective(plan);
		}
	}

}
