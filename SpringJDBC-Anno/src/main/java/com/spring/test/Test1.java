package com.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.config.Confiure;
import com.spring.mainApp.ShowApp;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext cts=null;
		cts=new AnnotationConfigApplicationContext(Confiure.class);
		
       try {
    	   ShowApp sh=cts.getBean("comp",ShowApp.class);
    	   System.out.println("get bean called properly");
        System.out.println(sh.count());
        
        System.out.println(sh.result1());
	}
    catch(Exception e)
       {
    	System.out.println("internal prob");
       }
	}

}
