package com.app.model;

import org.springframework.data.annotation.Id;

public class Teacher {

	@Id
	int Teacher_id;
	String name;
	String email;

	public Teacher() {
		super();
	}

	public Teacher(int teacher_id, String name, String email) {
		super();
		Teacher_id = teacher_id;
		this.name = name;
		this.email = email;
	}

	public int getTeacher_id() {
		return Teacher_id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setTeacher_id(int teacher_id) {
		Teacher_id = teacher_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [Teacher_id=" + Teacher_id + ", name=" + name + ", email=" + email + "]";
	}

}
