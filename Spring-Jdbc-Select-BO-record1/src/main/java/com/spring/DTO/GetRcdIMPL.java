package com.spring.DTO;

import org.springframework.beans.BeanUtils;

import com.spring.BO.BoMain;
import com.spring.DAO.FetchEmpIMPL;
import com.spring.finalDT.FInalDT;

public class GetRcdIMPL implements GetRecord {
     
	FetchEmpIMPL syy;
	
	public GetRcdIMPL(FetchEmpIMPL syy) {
		this.syy = syy;
	}

	@Override
	public FInalDT SerachEmp(int id) {
		FInalDT fin=new FInalDT();
		// TODO Auto-generated method stub
		BoMain dobs=syy.fetchRecord(id);
		BeanUtils.copyProperties(dobs,fin);
		return fin;
	}

}
