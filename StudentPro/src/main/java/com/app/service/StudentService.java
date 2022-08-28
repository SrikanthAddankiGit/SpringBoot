package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllTopic() {
		List<Student> topics = new ArrayList<>();
		studentRepo.findAll().forEach(topics::add);
		return topics;
	}

	@Override
	public void addStudent(Student student) {
		studentRepo.save(student);

	}

	@Override
	public int totalMarks(Student student) {
		
		int tot = student.getMarks1() + student.getMarks2() + student.getMarks3();
		return tot;
	}

}
