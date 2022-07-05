package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //framework
@RequestMapping(path = "api/v1/student") //framework w/ version
public class StudentController {

    //define studentService
    private final StudentService studentService;

    //constructor of the StudentService
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    // List of student based on constructor from Student.java
    @GetMapping
    public List<Student> getStudents() {
        //Return the student Service
        return studentService.getStudents();
    }
}
