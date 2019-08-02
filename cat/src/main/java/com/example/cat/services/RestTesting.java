package com.example.cat.services;

import com.example.cat.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestTesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate  = new RestTemplate();

        ResponseEntity<List<Student>> response = restTemplate.exchange(
                "http://10.51.10.111:1000/student",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Student>>(){});
        List<Student> Student = response.getBody();

        for(Student student : Student){
            System.out.println(student.toString());
        }

        System.err.println("Find One(GET)--------------------------------");

        Student student = restTemplate.getForObject(
                "http://10.51.10.111:1000/student/unit",
                Student.class);
        System.out.println(student.toString());



    }
}