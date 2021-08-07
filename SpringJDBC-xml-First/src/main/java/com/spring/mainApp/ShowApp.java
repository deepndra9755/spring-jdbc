package com.spring.mainApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariConfig;
@Component("comp")
public class ShowApp {
	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jt;
	//public static String QRTY_TO_COUNT="SELECT NAMe FROM SALLAC where id=1";
	   public static  String QRY_TO_RESUL="select id,name,last,sall,post from sallac";
		
	    public  List<Map<String,Object>> result1()
		{
		  return jt.queryForList(QRY_TO_RESUL);
		}
	
//	public String count()
//	{
//		
//	return jt.queryForObject(QRTY_TO_COUNT,String.class);
//	}
	
	
}
