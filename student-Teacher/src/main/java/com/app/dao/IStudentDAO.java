package com.app.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

import com.app.model.Student;

public interface IStudentDAO {
	public Map<String,Object>  getMarks();

	public void setStudentData(String name, String phone, Date dob);
	
	public Map<String, Object> MaxMarksInCourse();
	
	public Map<String,Object> GetHighCredit();
	
	public boolean create(Student student) throws SQLException;
}
