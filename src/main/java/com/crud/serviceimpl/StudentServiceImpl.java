package com.crud.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.beans.Passport;
import com.crud.beans.Student;
import com.crud.exception.StudentNotfoundException;
import com.crud.repository.PassportRepository;
import com.crud.repository.StudentRepository;
import com.crud.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private PassportRepository passportRepository;

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(int roll) {
		Student student = studentRepository.findById(roll).orElseThrow(StudentNotfoundException :: new);
		System.out.println("passport details: "+student.getPassport());
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int roll) {
		studentRepository.deleteById(roll);		
	}

	@Override
	public Student addStudent(Student student) {	
		Passport passport = new Passport(student.getRoll(),"K123456");
		passport = passportRepository.save(passport);
		student.setPassport(passport);
		return studentRepository.save(student);
	}
	

}
