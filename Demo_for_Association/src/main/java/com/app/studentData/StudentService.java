package com.app.studentData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;	
	
	public Student getAllStudents(int id) {
		return (Student)repo.findById(id).orElse(null);
	}
	
	public Student sendAllStudents(Student student){
		return repo.save(student);
	}

}
