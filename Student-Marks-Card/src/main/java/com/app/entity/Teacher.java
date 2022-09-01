package com.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Teacher {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private float physics;
	private float chemistry;
	private float maths;
	private float total;
	public float average;
	public String grade;
	@OneToMany(targetEntity=StudentMarks.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="T_ID",referencedColumnName="ID")
	private StudentMarks studentMarks;
	public Teacher() {
		super();
	}
	
	
//	public Teacher(int id, String name, float physics, float chemistry, float maths, float total, float average,
//			String grade, int studentId) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.physics = physics;
//		this.chemistry = chemistry;
//		this.maths = maths;
//		this.total = total;
//		this.average = average;
//		this.grade = grade;
//		this.studentMarks = new StudentMarks(studentId,"",physics,chemistry,maths,total,average,"", null);
//	}


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
		this.total = total;
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

	public StudentMarks getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(StudentMarks studentMarks) {
		this.studentMarks = studentMarks;
	}


	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", physics=" + physics + ", chemistry=" + chemistry + ", maths="
				+ maths + ", total=" + total + ", average=" + average + ", grade=" + grade + ", studentMarks="
				+ studentMarks + "]";
	}


	public void setStudentMarks(int studentId, String name2, float maths2, float chemistry2, float physics2,
			float average2, String grade2, String grade3) {
		// TODO Auto-generated method stub
		
	}

	
}
