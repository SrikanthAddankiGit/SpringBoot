package com.app.Service;

import com.app.entity.Teacher;

public interface ITeacherService {

	public Iterable<Teacher> displayMarks();

//	public void updateMarks(StudentMarks s);
//	public StudentMarks  getStudentMarks();

	void updateMarks(Teacher teacher);

//	public List<Teacher> findByTopicId(int id);
}
