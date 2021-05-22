package com.crud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.crud.beans.Student;
import com.crud.service.StudentService;
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/Students")
	public Iterable<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@PostMapping("/Students")
	public Student addStudent(@Valid @RequestBody Student student){
		return studentService.addStudent(student);
	}
	
	@GetMapping("/Students/{roll}")
	public Student getStudent(@PathVariable int roll) {
		return studentService.getStudent(roll);
	}
	
	@PutMapping("/Students")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	@DeleteMapping("/Students/{roll}")
	public void deleteStudent(@PathVariable int roll) {
		studentService.deleteStudent(roll); 
	}
	
}
