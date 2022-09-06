package com.app.controller;

import java.sql.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.StudentServiceImpl;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentServiceImpl service;
	
	@GetMapping("/student")
	public Map<String, Object> getMarks(){
		 System.out.println("Stored procedure called successfully!");
			return  service.getMarks();
			
	}
	
	@PostMapping("/save")
	public void setStudentData(@PathVariable("name") String name,  @PathVariable("phone") String phone, @PathVariable("dob") Date dob) {
		service.setStudentData(name, phone, dob);
	}
	
	@GetMapping("/maxMarks")
	public Map<String, Object> MaxMarksInCourse(){
		return service.MaxMarksInCourse();
		
	}
	
	@GetMapping("/high")
	public Map<String, Object> GetHighCredit() {
		return service.GetHighCredit();
	}
}
