package com.app.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.app.dao.StudentDAO;

@Service
public class StudentJDBCTemplate implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Override
//	@Bean(name="getStudentData")
	public Map<String, Object> getStudentData() {

		SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbcTemplateObject).withProcedureName("spGetMaxMarks");

//		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
//		Map<String, Object> out = simplejdbccall.execute(null);
		SqlParameterSource in = new MapSqlParameterSource(null);
		Map<String, Object> out = simplejdbccall.execute(in);

		return out;
	}
	
	
	

}
