package com.spring.DAO;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.BO.BoMain;

public class FetchEmpIMPL implements FetchEmp {
    
	JdbcTemplate jc;
	public FetchEmpIMPL(JdbcTemplate jc) {
		this.jc = jc;
	}
	
	
	@Override
	public BoMain fetchRecord(int idd) {
		
		// TO	DO Auto-generated method stub
		BoMain bo=jc.queryForObject("SELECT NAME,LAST,SALL,POST FROM SALLAC where id=?",new BeanPropertyRowMapper<BoMain>(BoMain.class){},idd);
		System.out.println(bo.getSALL());
		return bo;
	
	}

}
