package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.StudentService;
import com.app.entity.StudentMarks;

@RestController
@RequestMapping
public class StudentController {
	
	@Autowired
	private StudentService marksService;
	
	@GetMapping("/students")
	public Iterable<StudentMarks> displayMarks(){
		return marksService.displayMarks();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void updateMarks(@RequestBody StudentMarks studentMarks) {
		marksService.updateMarks(studentMarks);
	}
}
