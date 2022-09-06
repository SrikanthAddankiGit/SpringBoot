package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.StudentMarks;
import com.app.entity.Teacher;
import com.app.repository.TeacherMarksRepository;

@Service
public class TeacherService implements ITeacherService {

	@Autowired
	private TeacherMarksRepository TeacherRepo;

	@Autowired
	private StudentMarks studentMarks;

	/*
	 * @Override public StudentMarks getStudentMarks() {
	 * studentMarks.setTotal(studentMarks.getChemistry() + studentMarks.getMaths() +
	 * studentMarks.getPhysics()); studentMarks.getTotal();
	 * 
	 * // for Average studentMarks.setAverage(studentMarks.getTotal() / 3);
	 * studentMarks.getAverage();
	 * 
	 * // for grade if (studentMarks.getAverage() >= 80) {
	 * studentMarks.setGrade("A"); } else if (studentMarks.getAverage() >= 50) {
	 * studentMarks.setGrade("B"); } else { studentMarks.setGrade("C"); } return
	 * studentMarks;
	 * 
	 * }
	 */
	@Override
	public Iterable<Teacher> displayMarks() {
		// for Total
		studentMarks.setTotal(studentMarks.getChemistry() + studentMarks.getMaths() + studentMarks.getPhysics());
		studentMarks.getTotal();

		// for Average
		studentMarks.setAverage(studentMarks.getTotal() / 3);
		studentMarks.getAverage();

		// for grade
		if (studentMarks.getAverage() >= 80) {
			studentMarks.setGrade("A");
		} else if (studentMarks.getAverage() >= 50) {
			studentMarks.setGrade("B");
		} else {
			studentMarks.setGrade("C");
		}
//		Teacher tr = new StudentMarks();
		Iterable<Teacher> t = TeacherRepo.save(studentMarks);
		return t;
	}

	@Override
	public void updateMarks(Teacher teacher) {

		teacher.setTotal(teacher.getChemistry() + teacher.getPhysics() + teacher.getMaths());
		teacher.setAverage(teacher.getTotal() / 3);
		if (teacher.getTotal() >= 80) {
			teacher.setGrade("A");
		} else if (teacher.getTotal() >= 50) {
			teacher.setGrade("B");
		} else {
			teacher.setGrade("C");
		}
		TeacherRepo.save(teacher);

	}
	/*
	 * @Override public List<Teacher> findByTopicId(int id) { List<Teacher> teach =
	 * new ArrayList<>(); TeacherRepo.findById(id); return teach; }
	 */


	

}
