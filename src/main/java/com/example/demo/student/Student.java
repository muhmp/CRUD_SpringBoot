package com.example.demo.student;

//LocalDate package

import javax.persistence.*;
import java.time.LocalDate;
//import table



@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            // sequence generator value
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            // generated value
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )


    //id , name, age,
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dob;

    public Student() {
    }

    //constructor including the value
    public Student(Long id, String name, String email, Integer age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    //without id
    public Student(String name, String email, Integer age, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
