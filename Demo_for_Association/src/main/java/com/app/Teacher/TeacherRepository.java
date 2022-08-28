package com.app.Teacher;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.studentData.Student;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer>{
	
	public List<Student> findbyStudentId(int studentId);
}
