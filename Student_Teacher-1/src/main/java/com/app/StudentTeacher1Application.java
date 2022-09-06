package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication  // @springBootApplication this convenience for the configuration and enable-auto configuration and component scan
@ComponentScan(basePackages = "com.app")
public class StudentTeacher1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentTeacher1Application.class, args);
		
	}

}
