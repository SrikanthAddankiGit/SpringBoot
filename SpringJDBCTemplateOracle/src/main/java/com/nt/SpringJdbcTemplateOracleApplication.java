package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbcTemplateOracleApplication {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplateOracleApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		String sql = "SELECT * FROM STUDENTS";
		List<Student> students = jdbcTemplate.query(sql,	
				BeanPropertyRowMapper.newInstance(Student.class));
		students.forEach(System.out :: println);
	}
}
