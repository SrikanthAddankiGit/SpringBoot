package com.app.service;

import java.util.Map;

import com.app.model.Student;

public interface IStudentService {
	public Map<String,Object>  getMarks();
	public void setStudentData(Student student);

}
