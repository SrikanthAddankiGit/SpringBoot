package com.app;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component

public class Student {

	private int id;
	private String name;

	// Constructor for Student class

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
	}

	// setter method for Student class
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter method for student class
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
