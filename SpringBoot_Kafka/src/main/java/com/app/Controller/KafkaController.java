package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.Producer;

@RestController
@RequestMapping(value = "/kafka-example/")
public class KafkaController {
	
	@Autowired
	private Producer producer;
	
	@GetMapping(value="/produce")
	public String sendMessage(@RequestParam("message") String msg) {
		producer.send(msg);
		return "Success";
	}
}
