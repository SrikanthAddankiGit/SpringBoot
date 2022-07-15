package com.app;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Addition {

	private int a;
	private int b;
	private int c;

	public int sum(int a, int b) {
		return c = a + b;
	}
	
	
}
