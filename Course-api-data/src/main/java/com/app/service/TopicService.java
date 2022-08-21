package com.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Topic;
import com.app.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepo;

	public List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "Srikanth", "Java"),
			new Topic(2, "mohan", "SpringBoot"), new Topic(3, "Krishna", "Micro")));

	public List<Topic> getAllTopic() {
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopic(int id) {
		return topicRepo.findById(id).orElse(null);
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public String updateTopic(int id, Topic topic) {
		for (Topic t : topics) {
			if (t.getId() == id) {
				topicRepo.save(t);
			}
		}
		return "updated: ";
	}

	public void deleteTopic(int id) {
		topicRepo.deleteById(id);
		System.out.println("deleted successfully");
	}

}
