package com.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.topic.Topic;

@Service
public class TopicService {

	public List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "Srikanth", "Java"), new Topic(2, "mohan", "SpringBoot"),
			new Topic(3, "Krishna", "Micro")));

	public List<Topic> getAllTopics() {

		return topics;
	}
	
	public String getTopicId( int id) {
		Topic top = topics.get(id);
		return "Get the Id: "+top.getId()+", "+"Get Name: "+top.getName()+", "+"Get Technology: "+top.getTechnology();
	}
	public void addTopic(Topic topic) {
		 topics.add(topic);
	}

	public void updateTopic(int id, Topic topic) {
		for(Topic t: topics) {
			if(t.getId() == id) {
				topics.set(id, topic);
				return;
			}
			
		}
		
	}

	public void deleteTopic(int id) {
		topics.removeIf(t-> t.getId() == id);
		
	}

}
