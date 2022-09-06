package com.app.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Teacher;

import javax.sql.DataSource;

public interface IStudentDAO {

    public void create(Student student);

    public Map<String, Object> getMarks();

    public Map<String, Object> maxMarksInCourse();

    public Map<String, Object> getHighCredit();

    public void insertData(Student student);

    public void insertCourse(Course course);

    public void insertTeacher(Teacher teacher);


}
