package com.app.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

import com.app.model.Student;

import javax.sql.DataSource;

public interface IStudentDAO {

	public void create(Student student);
	public Map<String,Object>  getMarks();
	
	public Map<String, Object> MaxMarksInCourse();
	
	public Map<String,Object> GetHighCredit();

	public  void insertData(Student student);



}
