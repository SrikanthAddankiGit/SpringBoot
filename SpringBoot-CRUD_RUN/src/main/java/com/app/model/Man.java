package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
@Entity
@Data
@Table(name="student_or")
@Component
public class Man {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private Integer id;
	private String name;
	private String city;
}
