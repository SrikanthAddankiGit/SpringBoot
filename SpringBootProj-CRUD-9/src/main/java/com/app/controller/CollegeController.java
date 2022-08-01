package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Model.College;
import com.app.Service.CollegeService;

@RestController
@CrossOrigin("*")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@PostMapping(value="saveCollege")
	public College saveCollege(@RequestBody College college) {
		collegeService.saveCollege(college);
		return college;
	}
	
	@GetMapping(value="getCollege")
	public List<College> findAll(){
		return collegeService.findAll();
	}
	
	@PutMapping(value="updateCollege")
	public College updateCollege(@RequestBody College college) {
		return collegeService.updateCollege(college);
	}
	
	@DeleteMapping(value="deleteCollege")
	public String DeleteCollege(int id) {
		collegeService.DeleteCollege(id);
		return "Deleted";
	}
	
}
