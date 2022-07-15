package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjSampleAdditionRestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProjSampleAdditionRestApplication.class, args);
		HelloWorld hlo = ctx.getBean("hello", HelloWorld.class);

		System.out.println(hlo);
	}

}
