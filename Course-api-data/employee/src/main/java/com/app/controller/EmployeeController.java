package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl service;
	
	@PostMapping("/save")
	public boolean create(@RequestBody Employee employee) throws Exception {
		if(ObjectUtils.isEmpty(employee)) {
			throw new Exception("Required parameters course details are missing");
		}
		return service.create(employee);
	}
}
