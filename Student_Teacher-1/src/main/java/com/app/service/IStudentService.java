package com.app.service;

import java.util.Map;

import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Teacher;

public interface IStudentService {

	public void create(Student student);
	public Map<String,Object>  getMarks();

	public Map<String, Object> maxMarksInCourse();

	public Map<String,Object> getHighCredit();

	public  void insertData(Student student);
	public void insertCourse(Course course);

	public void insertTeacher(Teacher teacher);

}
