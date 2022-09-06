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

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDAO studentDAO;

    @Override
    public void create(Student student) {
        studentDAO.create(student);
    }

    @Override
    public Map<String, Object> getMarks() {
        return studentDAO.getMarks();
    }

    @Override
    public Map<String, Object> maxMarksInCourse() {
        return studentDAO.maxMarksInCourse();
    }

    @Override
    public Map<String, Object> getHighCredit() {
        return studentDAO.getHighCredit();
    }

    @Override
    public void insertData(Student student) {
        studentDAO.insertData(student);
    }

    public void insertCourse(Course course){
        studentDAO.insertCourse(course);
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        studentDAO.insertTeacher(teacher);
    }
}