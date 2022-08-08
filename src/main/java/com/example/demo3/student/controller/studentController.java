package com.example.demo3.student.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.student.entity.Student;
import com.example.demo3.student.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "api/v1/students")
@RequiredArgsConstructor
public class studentController {
	
	private final StudentService studentService;
		
	
	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
   }
   
   @PostMapping
   public void registerNewStudent(@RequestBody Student student){
		studentService.addNewStudent(student);
   }
   @DeleteMapping("/{studentId}")
   public void deleteStudent(@PathVariable("studentId") Long studentId){
		studentService.deleteStudent(studentId);
   }
}
