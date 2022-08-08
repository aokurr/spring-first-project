package com.example.demo3.student.entity;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.*;

import lombok.Data;
@Entity
@Table
@Data

//katmanlı mimari nedir neden kullanılır
//application.yml application.prop farkına bak hangisi daha rahat
//git version control system
public class Student {
    @Id
    @SequenceGenerator(
        name="student_sequence",
        sequenceName="student_sequence",
        allocationSize=1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"

    
    )
    
    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;

    public Student(long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }
    //builder pattern bak
    public Student(String name, String email,LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }
  

    public Student() {
    }
    public Integer getAge(){
        return Period.between(this.dob,LocalDate.now()).getYears();
    }
    
}