package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Model.College;
import com.app.Repository.CollegeRepository;

@Service
public class CollegeService implements ICollege {
		
	@Autowired
	private CollegeRepository collegeRepo;
	
	@Override
	public College saveCollege(College college) {
		return collegeRepo.save(college);
		
	}

	@Override
	public College updateCollege(College college) {
		
		return collegeRepo.save(college);
	}

	@Override
	public List<College> findAll() {
		
		return (List<College>) collegeRepo.findAll();
	}

	@Override
	public String DeleteCollege(int id) {
		collegeRepo.deleteById(id);
		return "Deleted";
	}

}
