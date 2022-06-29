package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController //framework
@RequestMapping(path = "api/v1/student") //framework w/ version
public class StudentController {

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
