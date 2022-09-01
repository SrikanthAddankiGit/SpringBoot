package com.app.model;


public class Student {

	int stud_id;
	int total_marks;
	String grade;

	public Student() {
		super();
	}

	public Student(int stud_id, int total_marks, String grade) {
		super();
		this.stud_id = stud_id;
		this.total_marks = total_marks;
		this.grade = grade;
	}

	public int getStud_id() {
		return stud_id;
	}

	public int getTotal_marks() {
		return total_marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", total_marks=" + total_marks + ", grade=" + grade + "]";
	}

}
