package com.app.Topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepo;

	/*
	 * public List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1,
	 * "Srikanth", "Java"), new Topic(2, "mohan", "SpringBoot"), new Topic(3,
	 * "Krishna", "Micro")));
	 */

	public List<Topic> getAllTopic() {
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String id) {
		return topicRepo.findById(id).orElse(null);
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public String updateTopic(String id, Topic topic) {
		topicRepo.save(topic);
		return "updated: "+topic.getId();
	}

	public void deleteTopic(String id) {
		topicRepo.deleteById(id);
		System.out.println("deleted successfully");
	}

}
