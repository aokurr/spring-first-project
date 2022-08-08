package com.example.demo3.student.config;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo3.student.Repository.StudentRepository;
import com.example.demo3.student.entity.Student;
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
        StudentRepository repository){
            return args -> {
                Student mariam=new Student(
                        "Maiam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000,Month.JANUARY,5)
                    );
                Student alex=new Student(
                        "alex",
                        "aaa.jamal@gmail.com",
                        LocalDate.of(2004,Month.JANUARY,5)
                    );
                    repository.saveAll(
                        List.of(mariam,alex)
                    );
            };
        }
    
}
