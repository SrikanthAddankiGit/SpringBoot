package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringWishMessageApplication {
	
	public SpringWishMessageApplication() {
		System.out.println("SpringWishMessageApplication.SpringWishMessageApplication()");
	}
	
	@Bean
	public  LocalDateTime createLDT() {
		System.out.println("BootProj01BasicDiApplication.createLDT()");
		return  LocalDateTime.now(); //static factory method giving 
		                                                          //LocalDateTime class obj having system date and time
	}
	
	
	public static void main(String[] args) {
		  //get  IOC container  from SpringApplication.run(-,-)
		ApplicationContext ctx=SpringApplication.run( SpringWishMessageApplication.class, args);
		  //  get  Target spring bean class obj ref
		 WishMessage generator=ctx.getBean("wishMessage",WishMessage.class);
		 //invoke the b.method
		 String result=generator.getWishMsg("raja");
		 System.out.println("result :::"+result);
		 System.out.println("_____________");
		 LocalDateTime ldt=ctx.getBean("createLDT",LocalDateTime.class);
		 System.out.println(ldt);
		 
		 //close the container  (optional but recomanded)
	     ((ConfigurableApplicationContext) ctx).close();
		
	}

}
