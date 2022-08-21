package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Topic;
import com.app.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/allValues")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();
		
	}
	
	@RequestMapping("/allValues/{id}")
	public Topic getTopic(@PathVariable int id) {
		return topicService.getTopic(id);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateId/{id}")
	public String updateTopic(@PathVariable int id,Topic topic) {
		return topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addedValues")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleted/{id}")
	public void deleteTopic(@PathVariable int id) {
		topicService.deleteTopic(id);
	}
}
