package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.IStudentDAO;
import com.app.model.Student;

@Service("stuService")
public class StudentService implements IStudentDAO {
	
	@Autowired
	private IStudentDAO dao;
	
	@Override
	public List<Student> getStudentDetails(String desg1, String desg2) throws Exception {
		
		List<Student> list = dao.getStudentDetails(desg1, desg2);
		return list;
	}

}
