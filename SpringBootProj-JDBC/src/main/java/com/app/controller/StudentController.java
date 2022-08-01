package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.app.model.Student;
import com.app.service.IStudentService;

@Controller("student")

public class StudentController {
	
	@Autowired
	private  IStudentService service;
	

	public List<Student> showAllStudent(String desg1,String desg2)throws Exception {
		List<Student> list=service.fetchAllStudent(desg1, desg2);
		 return list;
		
	}
}
