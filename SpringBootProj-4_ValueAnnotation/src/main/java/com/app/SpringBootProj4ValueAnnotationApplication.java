package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class SpringBootProj4ValueAnnotationApplication {
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProj4ValueAnnotationApplication.class, args);
		Hotel h = (Hotel)ctx.getBean(Hotel.class);
		
		System.out.println("Hotel: " + h);
	}

}
