package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import com.app.controller.StudentController;
import com.app.model.Student;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,JdbcTemplateAutoConfiguration.class})
@ComponentScan(basePackages = {" com.app.controller.StudentController","com.app.service.IStudentService"})
public class SpringBootProjJdbcApplication {

	@Autowired
	private Environment env;

	@Bean(name = "c3p0DS")
	public ComboPooledDataSource createC3P0DS() throws Exception {
		System.out.println("BootProj03LayeredAppApplication.createC3P0DS()");
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		cpds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		cpds.setUser(env.getRequiredProperty("spring.datasource.username"));
		cpds.setPassword(env.getRequiredProperty("spring.datasource.password"));
		cpds.setInitialPoolSize(Integer.parseInt(env.getRequiredProperty("c3p0.minsize")));
		cpds.setMaxPoolSize(Integer.parseInt(env.getRequiredProperty("c3p0.maxsize")));
		return cpds;
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProjJdbcApplication.class, args);
//		StudentController control = ctx.getBean("StudentController",StudentController.class); 
		StudentController cont = ctx.getBean("student",StudentController.class);
		try {
			List<Student> list = cont.showAllStudent("CLERK","MANAGER");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("SpringBootProjJdbcApplication.main()");
			((ConfigurableApplicationContext) ctx).close();
		}
		
	}

}
