package com.app.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(int id)
	

	public List<Course> findByTopicId(String topicId);

	public Course findOne(String id);
}
