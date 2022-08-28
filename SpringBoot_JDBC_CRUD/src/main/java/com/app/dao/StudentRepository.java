package com.app.dao;

import java.util.List;

import com.app.entity.Student;

public interface StudentRepository {

	Student saveStudent(Student student);

	Student updateStudent(Student student);

	Student getById(int id);

	String deleteById(int id);

	List<Student> allStudents();
}
