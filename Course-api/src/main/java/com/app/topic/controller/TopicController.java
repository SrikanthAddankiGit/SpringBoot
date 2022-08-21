package com.app.topic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.TopicService;
import com.app.topic.Topic;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/save")
	private List<Topic> word() {
		
		return topicService.getAllTopics();
		
	}
	
	@RequestMapping("/save/{id}")
	public String getTopicId(@PathVariable int id) {
		return topicService.getTopicId(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/addval")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateVal/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable int id) {
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public void deleteTopic(@PathVariable int id) {
		topicService.deleteTopic(id);
	}
	/*
	 * @PostMapping("/hola") private ArrayList<Topic> home(){
	 * 
	 * return (ArrayList<Topic>) Arrays.asList( new Topic(1,"Techmojo","Java"), new
	 * Topic(2,"Deloitte","Spring"), new Topic (3,"Morghan","React") );
	 * 
	 * }
	 */
}
