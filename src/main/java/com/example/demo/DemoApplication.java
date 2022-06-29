package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//Rest Controller
	//import GetMapping
	@GetMapping
/*	public String hello(){
		return "Hello World";
	}*/
	//example list
//DemoApplication.java
	public List<Student> hello1(){
		return List.of(
				new Student(
						1L, //represent id
						"mamet", //represent name
						"mamet@gmail.com",//represent email
						21,//represent age
						LocalDate.of(2000,Month.NOVEMBER,5) //represent dob
				)
		);
	}

}
