package com.app.studentData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/students/{id}")
	public Student getAllStudents(@PathVariable int id){
		return service.getAllStudents(id);
	}
	@PostMapping("/students")
	public Student sendAllStudents(@RequestBody Student student) {
		return service.sendAllStudents(student);
	}
}
