package com.app.Teacher;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.app.studentData.Student;



@Entity
public class Teacher {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String category;
	
	@OneToMany(cascade=CascadeType.ALL, targetEntity=Student.class)
	@JoinColumn(name="sid")
	private Student student;
	
	public Teacher() {
		super();
	}
	public Teacher(int id, String name, String category,int studentId) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.student = new Student(studentId,"","");
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", category=" + category + ", student=" + student + "]";
	}
	
	
}
