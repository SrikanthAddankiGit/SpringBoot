package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.app.model.Student;

@Component
public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStud_id(rs.getInt("stud_id"));
		student.setTotal_marks(rs.getInt("marks"));
		student.setGrade(rs.getString("grade"));
		return student;
	}

}
