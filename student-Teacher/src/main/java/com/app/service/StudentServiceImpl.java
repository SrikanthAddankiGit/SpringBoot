package com.app.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.app.dao.IStudentDAO;
import com.app.model.Student;

public class StudentServiceImpl implements  IStudentDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static Connection connection;
	private CallableStatement stmt;

	@Override
	public Map<String, Object> getMarks() {
		SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("GETMARKS");
		Map<String, Object> out = simplejdbccall.execute(simplejdbccall);
		System.out.println("Stored procedure called successfully!");
		return out;
	}

	@Override
	public void setStudentData(String name, String phone, Date dob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> MaxMarksInCourse() {
		SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("GetMaxMarks");
		Map<String, Object> out = simplejdbccall.execute(simplejdbccall);
		System.out.println("Stored procedure called successfully!");
		return out;
		
	}

	@Override
	public Map<String, Object> GetHighCredit() {
		SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("GetHighCredit");
		Map<String, Object> out = simplejdbccall.execute(simplejdbccall);
		System.out.println("Stored procedure called successfully!");
		return out;
	}

	@Override
	public boolean create(Student student) throws SQLException {
		stmt = connection.prepareCall("{call insertStudent(?, ?, ?)}");
		stmt.setString(1, student.getName());
		stmt.setString(2, student.getPhone());
		stmt.setDate(3, (Date) student.getDob());
		try {
			stmt.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SQLException("Insert procedure field");
		}
	}

}
