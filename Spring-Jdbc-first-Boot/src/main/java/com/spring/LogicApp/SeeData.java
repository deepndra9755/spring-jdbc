package com.spring.LogicApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariConfig;
@Component("comp")
public class SeeData {
	
	
	public static String QRTY_TO_COUNT="SELECT NAMe FROM SALLAC where id=1";
	   public static  String QRY_TO_RESUL="select id,name,last,sall,post from sallac where id=1";
		@Autowired
		private JdbcTemplate jtt;
	    
		public  Map<String, Object> result1()
		{
		  return jtt.queryForMap(QRY_TO_RESUL);
		}
	public String count()
	{
		
	return jtt.queryForObject(QRTY_TO_COUNT,String.class);
	}
}
	

