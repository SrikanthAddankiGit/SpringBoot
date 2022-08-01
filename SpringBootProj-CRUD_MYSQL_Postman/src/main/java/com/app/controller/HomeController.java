package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.serviceimplementation.StudentServiceImplementation;

@RestController

@CrossOrigin("*")
public class HomeController {

	@Autowired
	private StudentServiceImplementation studentServiceImpl;

	
	//=========================savestudent========================//
	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("HomeController.saveStudent() properly");
		studentServiceImpl.saveStudent(student);
		return student;

	}

	@GetMapping(value = "getStudent")
	public List<Student> findAllStudent() {

		return studentServiceImpl.findAllStudent();

	}
	
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
	}
	
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id) {
		studentServiceImpl.deleteStudent(id);
		return "Student deleted..";
	}
}
