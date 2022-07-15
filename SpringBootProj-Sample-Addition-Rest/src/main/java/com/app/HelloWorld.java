package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Component("hello")
public class HelloWorld {
	
	@GetMapping("/sum")
	public int getMessage(Addition addition) {
		System.out.println("HelloWorld.getMessage()");
		int s = addition.sum(10, 20);
		System.out.println(s);
		return s;
	}
}
