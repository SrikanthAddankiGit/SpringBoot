package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj02BasicDi2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProj02BasicDi2Application.class, args);
		Vehicle vehicle = context.getBean("vehicale",Vehicle.class);
		vehicle.motion("Hyd","RJY");
	}

}
