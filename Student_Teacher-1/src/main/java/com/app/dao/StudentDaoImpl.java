package com.app.dao;

import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.Map;

@Repository
public class StudentDaoImpl implements IStudentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static Connection connection;


    private Course course;

    private Student student;

    String url = "jdbc:mysql://localhost:3306/total";
    String user = "root";
    String password = "manager";

    @Override
    public Map<String, Object> getMarks() {
        SimpleJdbcCall simpleJdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("getMarks");
        Map<String, Object> out = simpleJdbccall.execute(simpleJdbccall);
        System.out.println("Stored procedure called successfully!");
        return out;

    }

    @Override
    public Map<String, Object> maxMarksInCourse() {
        SimpleJdbcCall simpleJdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("getMaxMarks");
        Map<String, Object> out = simpleJdbccall.execute(simpleJdbccall);
        System.out.println("Stored procedure called successfully!");
        return out;
    }

    @Override
    public Map<String, Object> getHighCredit() {
        SimpleJdbcCall simpleJdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("getHighCredit");
        Map<String, Object> out = simpleJdbccall.execute(simpleJdbccall);
        System.out.println("Stored procedure called successfully!");
        return out;
    }

    @Override
    public void insertData(Student student) {
        try (Connection connection = DriverManager.getConnection(url,user,password);) {
            connection.setAutoCommit(false);
            try ( CallableStatement insertStatement = connection.prepareCall("{call insertStudent(?, ?)}");) {
                insertStatement.setString(1, student.getName());
                insertStatement.setString(2, student.getPhone());
                insertStatement.executeUpdate();
                connection.commit();
                System.out.println("inserted......");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Override
    public void insertCourse(Course course) {
        try (Connection connection = DriverManager.getConnection(url,user,password);) {
            connection.setAutoCommit(false);
            try ( CallableStatement insertStatement = connection.prepareCall("{call insert_course(?, ?,?)}");) {
                insertStatement.setString(1, course.getCourseName());
                insertStatement.setInt(2, course.getCredit());
                insertStatement.setInt(3,course.getTeacherId());
                insertStatement.executeUpdate();
                connection.commit();
                System.out.println("Course inserted ......");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        try (Connection connection = DriverManager.getConnection(url,user,password);) {
            connection.setAutoCommit(false);
            try ( CallableStatement insertStatement = connection.prepareCall("{call insert_teacher(?, ?,?,?,?)}");) {
                insertStatement.setInt(1, teacher.getTeacherId());
                insertStatement.setString(2,teacher.getTeacherName());
                insertStatement.setInt(3,teacher.getStudent().getStudentId());
                insertStatement.setInt(4,teacher.getCourse().getCourseId());
                insertStatement.setInt(5,teacher.getMarks());
                insertStatement.executeUpdate();
                connection.commit();
                System.out.println(" Teacher inserted......");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(Student student) {
        String insertion = "insert into student (name,phone) values(?,?)";
        jdbcTemplate.update(insertion , student.getName(), student.getPhone());
    }
}
