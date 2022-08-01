package com.app.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

@Repository("empDAO")
public class StudentDAOImpl implements IStudentDAO {

	public static final String GET_STUDENT_DETAILS = "SELECT * FROM STUDENT WHERE JOB IN (?,?) ORDER BY JOB";

	@Autowired
	private DataSource ds;

	public List<Student> getStudentDetails(String desg1, String desg2) throws Exception {
		System.out.println("StudentDAOImpl.getStudentDetails()" + ds.getClass());

		List<Student> list = null;
		try (Connection con = ds.getConnection()) {
			PreparedStatement ps = con.prepareStatement(GET_STUDENT_DETAILS);
			ps.setString(1, desg1);
			ps.setString(2, desg2);

			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList<Student>();
				while (rs.next()) {
					Student stu = new Student();
					stu.setEno(rs.getInt(1));
					stu.setEname(rs.getString(2));
					stu.setDesg(rs.getString(3));
					stu.setSalary(rs.getDouble(4));
					

					list.add(stu);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return list;
	}

}
