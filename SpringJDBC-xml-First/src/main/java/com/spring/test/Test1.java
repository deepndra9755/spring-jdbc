package com.spring.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.mainApp.ShowApp;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cts=null;
		cts=new ClassPathXmlApplicationContext("com/spring/cgf/applicationContext.xml");
        ShowApp sh=cts.getBean("comp",ShowApp.class);
        //select id,name,last,sall,post from sallac
        List<Map<String,Object>> c1=sh.result1();
        for(Map<String, Object> jj:c1)
        {
         System.out.println(jj.get("id"));	
         System.out.println(jj.get("name"));
         System.out.println(jj.get("last"));
         System.out.println(jj.get("sall"));
         System.out.println(jj.get("post"));
        }
        
       try {
        //System.out.println(sh.count());
        System.out.println(sh.result1());
	}
    catch(Exception e)
       {
    	e.printStackTrace();
    	System.out.println("internal prob");
       }
	}

}
