package com.app.service;

import java.util.Map;

import com.app.model.Student;

public interface IStudentService {

	public void create(Student student);
	public Map<String,Object>  getMarks();

	public Map<String, Object> MaxMarksInCourse();

	public Map<String,Object> GetHighCredit();

	public  void insertData(Student student);

}
