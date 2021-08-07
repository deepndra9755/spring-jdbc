package com.spring;
import com.spring.LogicApp.SeeData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringJdbcFirstBootApplication {

	public static void main(String[] args) {
		ApplicationContext cts=null;
		
		cts=SpringApplication.run(SpringJdbcFirstBootApplication.class, args);
		
       try {
    	   SeeData sh=cts.getBean("comp",SeeData.class);
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
