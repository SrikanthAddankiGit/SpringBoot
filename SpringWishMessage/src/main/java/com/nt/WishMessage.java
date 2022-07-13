package com.nt;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessage {
	
	
	public WishMessage() {
		System.out.println("WishMessage.WishMessage()");
	}

	@Autowired
	private LocalDateTime ldt;
	
	public String getWishMsg(String user) {
		
		int hour = ldt.getHour();
		if(hour < 12) {
			return "Good Morning: "+user;
		}else if(hour >= 12) {
			return "Good AfterNoon: "+user;
		}else {
			return "Good Evening: "+user;
		}
		
	}

}
