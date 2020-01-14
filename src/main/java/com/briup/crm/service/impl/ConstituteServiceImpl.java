package com.briup.crm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.crm.bean.Contribution;
import com.briup.crm.service.ConstituteService;
import com.briup.crm.service.CustomerService;

@Service
public class ConstituteServiceImpl implements ConstituteService {
	@Autowired
	private CustomerService customerService;
	
	@Override
	public List<Contribution> findCustMarkup(int condition) {
		//创建list 保存contribution
		List<Contribution> conlist = new ArrayList<Contribution>();
		
		int count = customerService.findAllCustomer().size();
		
		if(condition==0) {//按等级
			Set<String> levels = customerService.findAllLevel();
			for (String level : levels) {
				int size = customerService.getCustByLevel(level);
				float percent = (float)size/count;
				Contribution con = new Contribution();
				con.setName(level);
				con.setY(percent);
				conlist.add(con);
			}
		}else if(condition==1) {//按信誉度
			Set<Integer> credits = customerService.findAllCredit();
			for (Integer credit : credits) {
				int size = customerService.getCustByCredit(credit);
				float percent = (float)size/count;
				Contribution con = new Contribution();
				con.setName(""+credit);
				con.setY(percent);
				conlist.add(con);
			}
		}else if(condition==2) {//按满意度
			Set<Integer> satisfys = customerService.findAllSatisfy();
			for (Integer satisfy : satisfys) {
				int size = customerService.getCustBySatisfy(satisfy);
				float percent = (float)size/count;
				Contribution con = new Contribution();
				con.setName(""+satisfy);
				con.setY(percent);
				conlist.add(con);
			}
		}
		return conlist;
	}

}
