package com.app.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.app.model.Employee;

public interface IEmployeeService {
	

	
	public boolean create(Employee employee) throws SQLException;
	

}
