package com.app.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.app.connections.DBConnection;
import com.app.model.Employee;

@Component
public class EmployeeServiceImpl implements IEmployeeService {

	private static Connection connection;
	
	private CallableStatement stmt;

	private JdbcTemplate jdbcTemplate;
	
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

	public Map<String, Object> getMarks() {
		SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("GetAllStudents");
		Map<String, Object> out = simplejdbccall.execute(simplejdbccall);
		System.out.println("Stored procedure called successfully!");
		return out;

	}
	private static Connection getConnection() {
		if(connection == null) {
			connection = DBConnection.getConnection();
		}
		return connection;
	}
	
}
