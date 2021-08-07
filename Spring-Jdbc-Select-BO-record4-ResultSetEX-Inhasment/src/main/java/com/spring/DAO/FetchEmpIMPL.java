package com.spring.DAO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.spring.BO.BoMain;

public class FetchEmpIMPL implements FetchEmp {
    List<BoMain> obj=new ArrayList<BoMain>();
	JdbcTemplate jc;
	public FetchEmpIMPL(JdbcTemplate jc) {
		this.jc = jc;
	}
	public class EMP implements ResultSetExtractor <List<BoMain>>
	{
		BoMain obkk=null;
		@Override
		public List<BoMain> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			while(rs.next())
			{
			obkk=new BoMain();
			obkk.setNAME(rs.getString("NAME"));
			obkk.setLAST(rs.getString("LAST"));
			obkk.setPOST(rs.getString("POST"));
			obkk.setSALL(rs.getString("SALL"));
			obj.add(obkk);
			}
			return obj;
			}
			
		}
		
		
	
	
	@Override
	public  List<BoMain> fetchRecord(String idd) {
		
		// TO	DO Auto-generated method stub
		List<BoMain> kop=jc.query("SELECT NAME,LAST,SALL,POST FROM SALLAC where post=?",new EMP(),idd);
		
		System.out.println("DAO cross");
		return kop;
	
}
	
}
