package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootJDBCController {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	public String getMethod() {
		jdbc.execute("insert into user(name,email)values('Srikanth','srikanth.addanki@techmojo.in')");
		return "data inserted Successfully";
	}
}
