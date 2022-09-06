package com.app.dao;


import java.util.Map;
import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Teacher;  // import statements



public interface IStudentDAO {  //IStudentDAO interface start here

    public void create(Student student);  // create method

    public Map<String, Object> getMarks();  //getMarks method

    public Map<String, Object> maxMarksInCourse();  // getMaxMarks in course

    public Map<String, Object> getHighCredit(); // get high credit

    public void insertData(Student student);  // insert data into student table

    public void insertCourse(Course course);  // insert data into course table

    public void insertTeacher(Teacher teacher);  // insert teacher data


}
// IStudentDAO interface end here