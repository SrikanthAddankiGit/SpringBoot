package com.nt;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessage {
	
	@Autowired
	private LocalDateTime ldt;
	
	public WishMessage() {
		System.out.println("WishMessage.WishMessage() ");
	}

	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	
	public String getMessage(String user) {
		int hour = ldt.getHour();
		if(hour <12) {
			return "GoodMoring "+user;
		}else {
			return "GoodEvng "+user;
		}
	}
	
	
}
