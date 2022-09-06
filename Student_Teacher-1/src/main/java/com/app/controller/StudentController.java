package com.app.controller;

import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Teacher;
import com.app.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map; // import statements

@RestController   // RestController annotation
public class StudentController {  // Controller class start here
    @Autowired

    private IStudentService service; // IStudentService Has-A relationship

    @GetMapping("/student")
    @ResponseBody
    public Map<String, Object> getMarks() {  // getting the marks using /student url
        System.out.println("Stored procedure called successfully!");
        return service.getMarks();
    }

    @PostMapping("/saveAll")  // Inserting the student data using sends to post method
    public void insertData(@RequestBody Student student) {

        service.insertData(student);
    }

    @GetMapping("/maxMarks")  // Getting the max marks in Course using get url
    public Map<String, Object> maxMarksInCourse() {
        return service.maxMarksInCourse();

    }

    @GetMapping("/high")   // Getting the high credit in using get url
    public Map<String, Object> getHighCredit() {

        return service.getHighCredit();
    }

    @PostMapping("/save")  // create method to sends the data to database using post mapping url
    public void create(@RequestBody Student student) {

        service.create(student);
    }

    @PostMapping("/courseInsert")  // insert the course data using post mapping url
    public void insertCourse(@RequestBody Course course) {
        service.insertCourse(course);
    }

    @PostMapping("/teacherData")  // insert the teacher data post mapping url
    public void insertTeacher(@RequestBody Teacher teacher) {

        service.insertTeacher(teacher);
    }


}
// Controller class end here