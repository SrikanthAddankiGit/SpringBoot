package com.app.Teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService service;
	
	@GetMapping("/students/{id}/teacher")
	public Teacher getAllTeacher(int studentId){
		return (Teacher) service.getTeacher(studentId);
	}
	@PostMapping("/students")
	public Teacher sendAllTeacher(@RequestBody Teacher teacher) {
		return service.sendAllTeacher(teacher);
	}
}
