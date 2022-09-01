package com.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Student_Marks")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
	
	@ManyToOne(targetEntity=Teacher.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="T_ID",referencedColumnName="ID")
	private Teacher teacher;
	
	@Override
	public String toString() {
		return "StudentMarks [id=" + id + ", name=" + name + ", physics=" + physics + ", chemistry=" + chemistry
				+ ", maths=" + maths + ", total=" + total + ", average=" + average + ", grade=" + grade + ", teacher="
				+ teacher + "]";
	}
	
	
	
	
}
