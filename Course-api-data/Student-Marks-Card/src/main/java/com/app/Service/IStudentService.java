package com.app.Service;

import com.app.entity.StudentMarks;

public interface IStudentService {
	
	public Iterable<StudentMarks> displayMarks();
	
	public void updateMarks(StudentMarks studentMarks);
}
