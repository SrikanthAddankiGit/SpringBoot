package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.StudentMarks;
import com.app.repository.StudentMarksRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentMarksRepository studentRepo;

	@Override
	public Iterable<StudentMarks> displayMarks() {
		Iterable<StudentMarks> s = studentRepo.findAll();
		s.forEach(prop->{
			prop.setTotal(prop.getChemistry()+prop.getMaths()+prop.getPhysics());
			prop.getTotal();
			prop.setAverage(prop.getTotal()/3);
			prop.getAverage();
			if(prop.getTotal() >= 80) {
				prop.setGrade("A");
			}else if(prop.getTotal() >= 50) {
				prop.setGrade("B");
			}else {
				prop.setGrade("C");
			}
			
		});
		return s;
	}

	@Override
	public void updateMarks(StudentMarks s) {
//		StudentMarks s = new StudentMarks();
		s.setTotal(s.getChemistry()+s.getPhysics()+s.getMaths());
		s.setAverage(s.getTotal()/3);
		if(s.getTotal() >= 80) {
			s.setGrade("A");
		}else if(s.getTotal() >= 50) {
			s.setGrade("B");
		}else {
			s.setGrade("C");
		}
		studentRepo.save(s);
		
	}

}
