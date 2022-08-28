package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.StudentRepository;
import com.app.entity.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return studentRepo.saveStudent(student);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return studentRepo.updateStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentRepo.getById(id);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentRepo.allStudents();
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return studentRepo.deleteById(id);
	}
	
	
}
