package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface IStudentService {
	
	public List<Student> getAllTopic();

	public void addStudent(Student student);
		
	public int totalMarks(Student student);
}
