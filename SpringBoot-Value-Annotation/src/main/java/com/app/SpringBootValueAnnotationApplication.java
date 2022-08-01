package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.Resturent.Resturent;

@SpringBootApplication
public class SpringBootValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootValueAnnotationApplication.class, args);
		
		Resturent res = ctx.getBean("rest",Resturent.class);
		System.out.println(res);
	}

}
