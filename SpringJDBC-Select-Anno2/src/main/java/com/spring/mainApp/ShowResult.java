package com.spring.mainApp;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariConfig;
//@Component("comp")
//@ComponentScan("com.spring")
//public class ShowResult {
//	@Autowired
//	@Qualifier("fop")
//	private JdbcTemplate jt;
//	public static String QRTY_TO_COUNT="SELECT NAME FROM SALLAC WHERE ID=1";
//    
//	public String count()
//	{
//	return jt.queryForObject(QRTY_TO_COUNT,String.class);
//	}
//	
	
//}
