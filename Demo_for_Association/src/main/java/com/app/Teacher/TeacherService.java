package com.app.Teacher;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository repo;	
	
	public List<Teacher> getTeacher(int studentId) {
		List<Teacher> tea = new ArrayList<>();
		repo.findbyStudentId(studentId).forEach(System.out::println);
		return tea;
	}
	
	public Teacher sendAllTeacher(Teacher teacher){
		return repo.save(teacher);
	}

	

}
