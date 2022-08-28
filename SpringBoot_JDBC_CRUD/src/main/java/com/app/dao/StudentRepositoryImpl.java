package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.entity.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	private static final String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT_DATA (id,fName,lName,email) values(?,?,?,?)";

	private static final String UPDATE_STUDENT_QUERY = "UPDATE STUDENT_DATA SET fName=? WHERE id=?";

	private static final String GET_STUDENT_BY_ID = "SELECT * FROM STUDENT_DATA WHERE id=?";

	private static final String DELETE_STUDENT_BY_ID = "DELETE FROM STUDENT_DATA WHERE id=?";

	private static final String GET_STUDENT_QUERY = "SELECT * FROM STUDENT_DATA";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Student saveStudent(Student student) {
		jdbcTemplate.update(INSERT_STUDENT_QUERY, student.getId(), student.getfName(), student.getlName(),
				student.getEmail());

		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		jdbcTemplate.update(UPDATE_STUDENT_QUERY, student.getfName(), student.getId());
		return student;
	}

	@Override
	public Student getById(int id) {

		return jdbcTemplate.queryForObject(GET_STUDENT_BY_ID, (rs, rowNum) -> {
			return new Student(rs.getInt("id"), rs.getString("fName"), rs.getString("lName"), rs.getString("email"));
		},id);
	}

	@Override
	public String deleteById(int id) {
		jdbcTemplate.update(DELETE_STUDENT_BY_ID, id);
		return "Student got deleted with id" + id;
	}

	@Override
	public List<Student> allStudents() {

		return jdbcTemplate.query(GET_STUDENT_QUERY, (rs, rowNum) -> {
			return new Student(rs.getInt("id"), rs.getString("fName"), rs.getString("lName"), rs.getString("email"));
		});
	}

}
