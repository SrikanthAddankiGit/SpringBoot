package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface IStudentService {
	public List<Student> fetchAllStudent(String desg1,String desg2);
}
