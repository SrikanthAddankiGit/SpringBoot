package com.app.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

import com.app.service.StudentServiceImpl;

public class StudentController {
	
	private StudentServiceImpl service;
	
	@GetMapping("/student")
	public Map<String, Object> getMarks(){
		 System.out.println("Stored procedure called successfully!");
			return  service.getMarks();
			
	}

}
