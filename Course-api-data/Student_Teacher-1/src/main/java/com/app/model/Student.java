package com.app.model;

import java.util.Date;

public class Student {
	
	private int s_id;
	private String name;
	private String phone;
	private Date dob;
	
	public Student() {

	}
	public Student(int s_id, String name, String phone, Date dob) {

		this.s_id = s_id;
		this.name = name;
		this.phone = phone;
		this.dob = dob;
	}

	public int getS_id() {
		return s_id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", name=" + name + ", phone=" + phone + ", dob=" + dob + "]";
	}

}
