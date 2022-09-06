package com.app.model;

// Student Class
public class Student { // class start here

    private int StudentId; //studentId field
    private String studentName;  //studentName field
    private String studentPhone;

    // Constructor with parameters
    public Student(int studentId, String studentName, String studentPhone) {
        StudentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
    }

    // Getters and setters for fields
    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    //toStrings for fields
    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                '}';
    }
}
// class end here