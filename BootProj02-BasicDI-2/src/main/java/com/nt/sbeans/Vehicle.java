package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicale")
public class Vehicle {
		
		@Autowired
		@Qualifier("ptrl")
		private IEngine iEngine;
		
		public Vehicle() {
			System.out.println("Vehicle.Vehicle()");
		}
		public void motion(String strt,String end) {
			iEngine.start();
			System.out.println("The Vehicle started: "+strt);
			System.out.println("The Vehicle is going on.......");
			System.out.println("The Vehicle destination  is: "+end);
			System.out.println("The Vehicle is stoped");
		}
}
