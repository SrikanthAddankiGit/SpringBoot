package com.app.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {

    private int teacherId;
    private String teacherName;

    private int marks;


    private Student student;


    private Course course;

    public Teacher(int teacherId, String teacherName, int marks,Student student,Course course) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.marks = marks;
        this.student = student;
        this.course=course;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", marks=" + marks +
                ", student=" + student +
                ", course=" + course +
                '}';
    }
}
