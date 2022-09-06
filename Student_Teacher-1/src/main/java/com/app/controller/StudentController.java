package com.app.controller;

import com.app.model.Student;
import com.app.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StudentController {


    @Autowired
    private StudentServiceImpl service;


    @GetMapping("/student")
    public Map<String, Object> getMarks() {
        System.out.println("Stored procedure called successfully!");
        return service.getMarks();

    }

    @PostMapping("/saveAll")
    public void insertData(@RequestBody Student student) {

        service.insertData(student);
    }

    @GetMapping("/maxMarks")
    public Map<String, Object> MaxMarksInCourse() {
        return service.MaxMarksInCourse();

    }

    @GetMapping("/high")
    public Map<String, Object> GetHighCredit() {

		return service.GetHighCredit();
    }

	@PostMapping("/save")
	public void create(@RequestBody Student student){

        service.create(student);
	}


}
