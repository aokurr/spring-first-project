package com.example.demo3.student.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
   //optional neden kullanılır araştır 
   Optional <Student> findStudentByEmail(String email);
    //query bak
    
}
