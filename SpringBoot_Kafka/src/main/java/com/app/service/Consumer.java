package com.app.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "my_topic", groupId="mygroup")
	public void consumerFormTopic(String message) {
		System.out.println("Consumer.consumerFormTopic()"+message);
	}
}
