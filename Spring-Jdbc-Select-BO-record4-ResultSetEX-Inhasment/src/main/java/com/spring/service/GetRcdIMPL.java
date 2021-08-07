package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.spring.BO.BoMain;
import com.spring.DAO.FetchEmpIMPL;
import com.spring.DTO.FInalDT;

public class GetRcdIMPL implements GetRecord {
     
	FetchEmpIMPL syy;
	
	public GetRcdIMPL(FetchEmpIMPL syy) {
		this.syy = syy;
	}
	List<BoMain> lst1;
	@Override
	public List<FInalDT> SerachEmp(String id) {
		//FInalDT fin=new FInalDT();
		List<FInalDT> lst =null;
		// TODO Auto-generated method stub
		lst1=syy.fetchRecord(id);
		BeanUtils.copyProperties(lst1, lst);
	   return lst;
	}

}
