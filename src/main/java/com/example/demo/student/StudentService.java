package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    // List of student based on constructor from Student.java
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L, //represent id
                        "mamet", //represent name
                        "mamet@gmail.com",//represent email
                        21,//represent age
                        LocalDate.of(2000, Month.NOVEMBER,5) //represent dob
                )
        );
    }
}
