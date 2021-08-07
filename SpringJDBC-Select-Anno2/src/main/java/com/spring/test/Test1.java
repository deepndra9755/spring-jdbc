package com.spring.test;

import java.util.List;
import java.util.Map;

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
    	  Map<String, Object> kp =sh.result1();
//    	  for(List lp:kp)
//    	  {
//    	lp.get("name");
//    	lp.get("last");
//    	lp.get("sall");
//    	lp.get("post");
//    	
//    	  }
    	   
        System.out.println(kp);
       }
       
	
    catch(Exception e)
       {
    	System.out.println("internal prob");
       }
	}

}
