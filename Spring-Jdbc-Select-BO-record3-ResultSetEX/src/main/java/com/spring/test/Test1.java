package com.spring.test;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.DTO.GetRcdIMPL;
import com.spring.finalDT.FInalDT;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FInalDT> dp=new ArrayList<FInalDT>();
		ApplicationContext cts=null;
		cts=new ClassPathXmlApplicationContext("com/spring/cgf/applicationContext.xml");
		GetRcdIMPL sh=cts.getBean("dpp",GetRcdIMPL.class);
	     try {
        dp=sh.SerachEmp("CA");
        int six=dp.size();
        for(int dd=0;dd<six;dd++)
        {
        	FInalDT hh=dp.get(dd);
        	System.out.println(hh.getNAME()+" "+hh.getLAST()+" "+hh.getPOST()+" "+hh.getSALL());
        }
	   }
    catch(Exception e)
       {
    	e.printStackTrace();
    	System.out.println("internal prob");
       }
	}

}
