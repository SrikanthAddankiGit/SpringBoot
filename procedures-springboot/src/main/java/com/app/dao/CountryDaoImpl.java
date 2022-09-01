package com.app.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

@Component
public class CountryDaoImpl {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public Map<String,Object> execute(){
		
		SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbctemplate).withProcedureName("GET_EMPLOYEES");
		
		SqlParameterSource in = new MapSqlParameterSource(null);
		Map<String,Object> simpleJdbcCallResult = simplejdbccall.execute(in);
		System.out.println(simpleJdbcCallResult);
		return simpleJdbcCallResult;
		
	}

}
