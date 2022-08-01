package com.app.Dao;

import java.util.List;

import com.app.model.Student;

public interface IStudentDAO {
	public List<Student> getStudentDetails(String desg1,String desg2) throws Exception;
}
