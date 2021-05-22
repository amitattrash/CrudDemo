package com.crud.exception;

import java.util.function.Supplier;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class StudentNotfoundException extends RuntimeException implements Supplier {
	public StudentNotfoundException() {
		super("Student Not found");
	}
	
	@Override
	public StudentNotfoundException get() {
		return new StudentNotfoundException();
	}

}
