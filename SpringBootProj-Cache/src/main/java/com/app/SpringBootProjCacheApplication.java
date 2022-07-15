package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootProjCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjCacheApplication.class, args);
	}

}
