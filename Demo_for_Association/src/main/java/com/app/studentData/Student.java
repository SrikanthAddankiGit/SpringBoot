package com.app.studentData;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.app.Teacher.Teacher;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String name;
	private String category;
//	@ManyToMany(targetEntity=Teacher.class,cascadeType.ALL,fetchType.LAZY)
//	private Teacher teacher;
	public Student() {
		super();
	}
	public Student(int sid, String name, String category) {
		super();
		this.sid = sid;
		this.name = name;
		this.category = category;
	}
	public int getId() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public void setId(int sid) {
		this.sid = sid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Student [id=" + sid + ", name=" + name + ", category=" + category + "]";
	}
	
	
}
