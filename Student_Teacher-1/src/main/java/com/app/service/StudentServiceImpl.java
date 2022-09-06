package com.app.service;

import java.sql.*;
import java.util.Map;

import com.app.model.Course;
import com.app.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.app.dao.IStudentDAO;
import com.app.model.Student;

@Service  // @Service annotation is used with classes that provides some business functionalities  spring context autodetect these classes
public class StudentServiceImpl implements IStudentService {  // is-a relationship in StudentServiceImpl
    @Autowired
    private IStudentDAO studentDAO;  // has-a relationship in IStudentDAO dependency injection

    @Override
    public void create(Student student) {
        studentDAO.create(student);
    }  // create method for student classes

    @Override
    public Map<String, Object> getMarks() {
        return studentDAO.getMarks();
    }  // get maxMarks

    @Override
    public Map<String, Object> maxMarksInCourse() {
        return studentDAO.maxMarksInCourse();
    } // maxMarks in course

    @Override
    public Map<String, Object> getHighCredit() {
        return studentDAO.getHighCredit();
    }  //get high credit method

    @Override
    public void insertData(Student student) {
        studentDAO.insertData(student);
    }  // insert data  method

    public void insertCourse(Course course){
        studentDAO.insertCourse(course);
    }  // insert course method

    @Override
    public void insertTeacher(Teacher teacher) {  // insert teacher method
        studentDAO.insertTeacher(teacher);
    }
}