package com.crud.serviceimpl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.beans.Passport;
import com.crud.beans.Student;
import com.crud.exception.StudentNotfoundException;
import com.crud.repository.PassportRepository;
import com.crud.repository.StudentRepository;
import com.crud.service.PassportService;
import com.crud.service.StudentService;

@Service
public class PassportServiceImpl implements PassportService{
	@Autowired
	private PassportRepository passportRepository;

	@Override
	public Passport getPassport(int id) {
		Passport passport = passportRepository.findById(id).orElse(new Passport());
		System.out.println("Student details: "+passport.getStudent());
		return passport;
	}

}
