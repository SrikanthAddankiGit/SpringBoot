package com.app.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentRepository;
import com.app.model.Student;
import com.app.serviceInterface.StudentInterface;

@Service
public class StudentServiceImplementation implements StudentInterface {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {

		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAllStudent() {

		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);

	}

}
