package com.crud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.crud.beans.Passport;
import com.crud.beans.Student;
@Component
public interface StudentService {
	public List<Student> getAllStudent();
	public Student getStudent(int roll);
	public Student updateStudent(Student student);
	public void deleteStudent(int roll);
	public Student addStudent(Student student);
}
