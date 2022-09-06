package com.app.dao;
// import statements

import com.app.model.Course;
import com.app.model.Student;
import com.app.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Inherited;
import java.sql.*;
import java.util.Map;

@Repository   // Repository annotation
public class StudentDaoImpl implements IStudentDAO {   // Inherited IStudentDAO methods to StudentDaoImpl
    @Autowired  // Autowired  for dependency injection for jdbc template
    private JdbcTemplate jdbcTemplate;  // jdbcTemplate is the central class in the jdbc core package, it's simplify the use of jdbc to avoid errors

    private static Connection connection;  // Connection this is for a session between a java application and a database


    private Course course;  //Course class has-a relationship inheritance

    private Student student; //Student class has-a relationship inheritance

    String url = "jdbc:mysql://localhost:3306/total";   // url for database connections
    String user = "root";  // database username
    String password = "manager"; //database password

    @Override  // @Override for allows to a subclass or child class to provide
    public Map<String, Object> getMarks() {  // specific implementation of method that is already available in super class
        SimpleJdbcCall simpleJdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("getMarks");
        Map<String, Object> out = simpleJdbccall.execute(simpleJdbccall);  //simpleJdbcCall for a multithreaded,reusable object representing a call to a stored procedure or a stored function
        System.out.println("Stored procedure called successfully!");
        return out;

    }

    @Override
    public Map<String, Object> maxMarksInCourse() {  // maxMarks in course using stored procedure to access the data
        SimpleJdbcCall simpleJdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("getMaxMarks");
        Map<String, Object> out = simpleJdbccall.execute(simpleJdbccall);  // map is an object that maps keys to values
        System.out.println("Stored procedure called successfully!");
        return out;
    }

    @Override
    public Map<String, Object> getHighCredit() {   // getHigh credit using stored procedure
        SimpleJdbcCall simpleJdbccall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("getHighCredit");
        Map<String, Object> out = simpleJdbccall.execute(simpleJdbccall);
        System.out.println("Stored procedure called successfully!");
        return out;
    }

    @Override
    public void insertData(Student student) {  // insert the Student related filed data using stored procedures
        try (Connection connection = DriverManager.getConnection(url,user,password);) { //Driver manager manages the set of java
            connection.setAutoCommit(false);      // database connectivity drivers available for an application to use
            try ( CallableStatement insertStatement = connection.prepareCall("{call insertStudent(?, ?)}");) {
                insertStatement.setString(1, student.getStudentName()); // callable statement used for execute the stored procedure JDBC   provides a stored procedure sql escape the allows stored procedure in standard way
                insertStatement.setString(2, student.getStudentPhone());
                insertStatement.executeUpdate();
                connection.commit();  // commit for permanently save all the changes made in the transaction of a database or table
                System.out.println("inserted......");

            } catch (SQLException e) {  // sqlException  for provides on a database error or other errors
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();  // this is used to handle exceptions errors and prints the throwable along with the other details like the number line  and class name where exception occurred
        }

    }


    @Override
    public void insertCourse(Course course) {
        try (Connection connection = DriverManager.getConnection(url,user,password);) {
            connection.setAutoCommit(false);   // i was setting connection so that nothing goes in the database in db uncommitted
            try ( CallableStatement insertStatement = connection.prepareCall("{call insert_course(?, ?,?)}");) {
                insertStatement.setString(1, course.getCourseName()); // callable statement used for execute the stored procedure JDBC   provides a stored procedure sql escape the allows stored procedure in standard way
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
    public void insertTeacher(Teacher teacher) {  // insert the teacher fields related data into teacher table using stored procedure
        try (Connection connection = DriverManager.getConnection(url,user,password);) {
            connection.setAutoCommit(false);
            try ( CallableStatement insertStatement = connection.prepareCall("{call insert_teacher(?, ?,?,?,?)}");) {
                insertStatement.setInt(1, teacher.getTeacherId());// callable statement used for execute the stored procedure JDBC   provides a stored procedure sql escape the allows stored procedure in standard way
                insertStatement.setString(2,teacher.getTeacherName());  // insert the teacher name
                insertStatement.setInt(3,teacher.getStudent().getStudentId()); // insert the student id
                insertStatement.setInt(4,teacher.getCourse().getCourseId()); // insert the course id
                insertStatement.setInt(5,teacher.getMarks());  // insert  the marks
                insertStatement.executeUpdate();  // execute update if executing a stored procedure results in the update count that is greater than one, or that generate more than one result set use the execute method in stored procedure
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
    public void create(Student student) {  // create method used for normally insert the data into student table
        String insertion = "insert into student (name,phone) values(?,?)";
        jdbcTemplate.update(insertion , student.getStudentName(), student.getStudentPhone());
    }
}
