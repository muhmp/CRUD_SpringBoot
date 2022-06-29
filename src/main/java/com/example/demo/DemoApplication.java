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
	public List<Student> hello1(){


		return List.of(
				new Student(
						1L,
						"mamet@gmail.com",
						23,
						LocalDate.of(2000,Month.NOVEMBER,5),

				)
		);
	}

}
