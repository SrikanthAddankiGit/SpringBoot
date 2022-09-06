package com.app.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.app.connections.DBConnection;
import com.app.model.Employee;

@Component
public class EmployeeServiceImpl implements IEmployeeService {

	private static Connection connection;
	
	private CallableStatement stmt;
	
	public static final String INSERT_COURSE = "insert_Course";

	
	@Override
	public boolean create(Employee employee) throws SQLException{
		connection = getConnection();
		stmt = connection.prepareCall("{call "+INSERT_COURSE +"(?,?)}");
		stmt.setString(1, employee.getName());
		stmt.setInt(2, employee.getAge());
		try {
			stmt.execute();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new SQLException("Insert procedure field");
		}
	}
	
	private Connection getConnection() {
		if(connection == null) {
			connection = DBConnection.getConnection();
		}
		return connection;
	}
	
}
