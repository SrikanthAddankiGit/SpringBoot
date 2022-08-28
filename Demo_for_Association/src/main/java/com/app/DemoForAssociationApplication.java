package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EntityScan("com.app.Teacher") // path of the entity model
@EnableJpaRepositories("com.app.TeacherRepository") // path of jpa repository 

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class DemoForAssociationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForAssociationApplication.class, args);
	}

}
