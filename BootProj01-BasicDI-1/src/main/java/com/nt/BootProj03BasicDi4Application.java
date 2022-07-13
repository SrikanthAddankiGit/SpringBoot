package com.nt;


import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootProj03BasicDi4Application {
	
	@Bean(name="ldt")
	public LocalDateTime localtime() {
		System.out.println("BootProj03BasicDi4Application.localtime()");
		return LocalDateTime.now();
	}
	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(BootProj03BasicDi4Application.class, args);
		WishMessage wishMess = context.getBean(com.nt.WishMessage.class,"wmg");
		String message = ((WishMessage) wishMess).getMessage("Raja");
		System.out.println(message);
	}

}
