package com.example.cat.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long id;

    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_number")
    private int studentNumber;


    public Student(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;

    }
    private Student(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", studentName='" +
                studentName + ",studentNumber=" +
                studentNumber + '\'' + '}';
    }
}


