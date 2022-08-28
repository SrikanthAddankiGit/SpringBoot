package com.app.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepo;

	public List<Course> getAllCourse(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepo.findByTopicId(topicId);
//		courseRepo.findAll().forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepo.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepo.save(course);
	}

	public String updateCourse(Course course) {
		courseRepo.save(course);
		return "updated: ";
	}

	public void deleteCourse(String id) {
		courseRepo.deleteById(id);
		System.out.println("deleted successfully");
	}

}
