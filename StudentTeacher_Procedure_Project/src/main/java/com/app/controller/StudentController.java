package com.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.StudentJDBCTemplate;

@RestController
public class StudentController {

	@Autowired
	private StudentJDBCTemplate service;

	@GetMapping("/student")
	public Map<String,Object> getStudentData() {
		return  service.getStudentData();
	}
}
