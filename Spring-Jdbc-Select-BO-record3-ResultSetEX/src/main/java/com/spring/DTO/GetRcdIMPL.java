package com.spring.DTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.spring.BO.BoMain;
import com.spring.DAO.FetchEmpIMPL;
import com.spring.finalDT.FInalDT;

public class GetRcdIMPL implements GetRecord {
     
	FetchEmpIMPL syy;
	
	public GetRcdIMPL(FetchEmpIMPL syy) {
		this.syy = syy;
	}
	List<BoMain> lst1=new ArrayList<BoMain>();

	@Override
	public List<FInalDT> SerachEmp(String id) {
		//FInalDT fin=new FInalDT();
		List<FInalDT> lst=new ArrayList<FInalDT>();
		// TODO Auto-generated method stub
		lst1=syy.fetchRecord(id);
		int s=lst1.size();
	     for(int ss=0;ss<s;ss++)
	     {
	    	 FInalDT jj=new FInalDT();
	    BoMain kopp=new BoMain();
	    kopp=lst1.get(ss);
	    jj.setNAME(kopp.getNAME());
	    jj.setLAST(kopp.getLAST());
	    jj.setPOST(kopp.getPOST());
	    jj.setSALL(kopp.getSALL());
	  
	    lst.add(jj); 
	     }
		System.out.println("dto cross");
		return lst;
	}

}
