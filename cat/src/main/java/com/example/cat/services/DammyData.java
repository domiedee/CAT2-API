package com.example.cat.services;

import com.example.cat.model.Student;
import com.example.cat.repository.StudentRepository;
import com.example.cat.repository.JpaRepository;
import com.example.cat.repository.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DammyData implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public DammyData( StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args)throws Exception{
        Student student=new Student("Domnic Dwalo",94657);

        studentRepository.save(student);

    }
}