package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Marks")
public class StudentMarks {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private float physics;
	private float chemistry;
	private float maths;
	private float total;
	private float average;
	private String grade;
	
	public StudentMarks() {
		super();
	}
	public StudentMarks(int id, String name, float physics, float chemistry, float maths, float total, float average, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
		this.total = total;
		this.average = average;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPhysics() {
		return physics;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public float getChemistry() {
		return chemistry;
	}
	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total=total;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public String getGrade() {
		
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentMarks [id=" + id + ", name=" + name + ", physics=" + physics + ", chemistry=" + chemistry
				+ ", maths=" + maths + ", total=" + total + ", average=" + average + ", grade=" + grade + "]";
	}
	
	
	
	
}
