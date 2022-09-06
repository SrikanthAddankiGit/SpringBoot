package com.app.controller;

import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Teacher;
import com.app.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class StudentController {
    @Autowired

    private IStudentService service;

    @GetMapping("/student")
    @ResponseBody
    public Map<String, Object> getMarks() {
        System.out.println("Stored procedure called successfully!");
        return service.getMarks();
    }

    @PostMapping("/saveAll")
    public void insertData(@RequestBody Student student) {

        service.insertData(student);
    }

    @GetMapping("/maxMarks")
    public Map<String, Object> maxMarksInCourse() {
        return service.maxMarksInCourse();

    }

    @GetMapping("/high")
    public Map<String, Object> getHighCredit() {

        return service.getHighCredit();
    }

    @PostMapping("/save")
    public void create(@RequestBody Student student) {

        service.create(student);
    }

    @PostMapping("/courseInsert")
    public void insertCourse(@RequestBody Course course){
        service.insertCourse(course);
    }

    @PostMapping("/teacherData")
    public void insertTeacher(@RequestBody Teacher teacher){

        service.insertTeacher(teacher);
    }


}
