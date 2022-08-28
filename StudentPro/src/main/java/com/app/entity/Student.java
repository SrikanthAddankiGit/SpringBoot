package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Data")
public class Student {
	
	@Id
	private int stuId;
	private String sName;
	private String sBranch;
	private int marks1;
	private int marks2;
	private int marks3;
	
	
	public Student() {
		super();
	}
	public Student(int stuId, String sName, String sBranch, int marks1, int marks2, int marks3) {
		super();
		this.stuId = stuId;
		this.sName = sName;
		this.sBranch = sBranch;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsBranch() {
		return sBranch;
	}
	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", sName=" + sName + ", sBranch=" + sBranch + ", marks1=" + marks1
				+ ", marks2=" + marks2 + ", marks3=" + marks3 + "]";
	}
	
	
}
