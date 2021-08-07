package com.spring.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.DTO.GetRcdIMPL;
import com.spring.finalDT.FInalDT;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cts=null;
		cts=new ClassPathXmlApplicationContext("com/spring/cgf/applicationContext.xml");
		GetRcdIMPL sh=cts.getBean("dpp",GetRcdIMPL.class);
       FInalDT dp=sh.SerachEmp(2);
       System.out.println(dp.getNAME());
       System.out.println(dp.getLAST());
       System.out.println(dp.getSALL());
       System.out.println(dp.getPOST());
       
    
        
        
       try {
        
	}
    catch(Exception e)
       {
    	e.printStackTrace();
    	System.out.println("internal prob");
       }
	}

}
