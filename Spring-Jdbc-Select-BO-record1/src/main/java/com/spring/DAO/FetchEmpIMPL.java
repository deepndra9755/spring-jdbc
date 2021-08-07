package com.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.BO.BoMain;

public class FetchEmpIMPL implements FetchEmp {
    
	JdbcTemplate jc;
	public FetchEmpIMPL(JdbcTemplate jc) {
		this.jc = jc;
	}
	public class EmpFindOut implements RowMapper<BoMain> 
	{

		@Override
		public BoMain mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}

	}
	
	@Override
	public BoMain fetchRecord(int idd) {
		
		// TO	DO Auto-generated method stub
		BoMain bo=jc.queryForObject("SELECT NAME,LAST,SALL,POST FROM SALLAC where id=?",new RowMapper<BoMain>(){

			
			public BoMain mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
			   BoMain bod=new BoMain();
			   bod.setNAME(rs.getString("name"));
			   bod.setLAST(rs.getString("last"));
			   bod.setPOST(rs.getString("post"));
			   bod.setSALL(rs.getString("SALL"));
			   return bod;
			}
			
		
		},
				
		idd);
		System.out.println(bo.getSALL());
		return bo;
	
	}

}
