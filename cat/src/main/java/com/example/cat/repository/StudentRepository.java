package com.example.cat.repository;



import com.example.cat.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findAll();


    void save(Student student);
}
