package com.app.dao;

import com.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import java.sql.*;
import java.util.Map;

public class StudentDaoImpl implements IStudentDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static Connection connection;
    private CallableStatement stmt;

    String jdbcUrl = "jdbc:mysql://localhost:3306/total";
    String userName = "root";
    String password = "manager";

    String sql_insert = "";

    @Override
    public Map<String, Object> getMarks() {
        SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("GETMARKS");
        Map<String, Object> out = simplejdbccall.execute(simplejdbccall);
        System.out.println("Stored procedure called successfully!");
        return out;

    }


    @Override
    public Map<String, Object> MaxMarksInCourse() {
        SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("GetMaxMarks");
        Map<String, Object> out = simplejdbccall.execute(simplejdbccall);
        System.out.println("Stored procedure called successfully!");
        return out;

    }

    @Override
    public Map<String, Object> GetHighCredit() {
        SimpleJdbcCall simplejdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("GetHighCredit");
        Map<String, Object> out = simplejdbccall.execute(simplejdbccall);
        System.out.println("Stored procedure called successfully!");
        return out;
    }

    @Override
    public void insertData(Student student) {
        try (Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);) {
            conn.setAutoCommit(false);

            try (PreparedStatement insertStmt = conn.prepareStatement("insertStudent")) {
                insertStmt.setString(1, student.getName());
                insertStmt.setString(2, student.getPhone());
                insertStmt.executeUpdate();
                conn.commit();
                System.out.println("inserted......");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public void create(Student student) {
        String sql = "insert into student (name,phone) values(?,?)";
        jdbcTemplate.update(sql, student.getName(), student.getPhone());
    }
}
