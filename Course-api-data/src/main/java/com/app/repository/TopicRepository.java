package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic,Integer>{
	
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(int id)
}
