package com.app.service;

import java.util.Map;

import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Teacher;

public interface IStudentService {  // IStudentService interface start here

	public void create(Student student); // create method
	public Map<String,Object>  getMarks(); // getMarks method

	public Map<String, Object> maxMarksInCourse(); // max marks method

	public Map<String,Object> getHighCredit();  // get high credit method

	public  void insertData(Student student);  // insertData method
	public void insertCourse(Course course);  // insertCourse method

	public void insertTeacher(Teacher teacher); // insertTeacher method

}
// close here