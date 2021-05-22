package com.crud.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class GenericExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(StudentNotfoundException.class)
	public final ResponseEntity<Object> handleStudentNotFoundException(Exception ex, WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity(exceptionResponse,HttpStatus.NOT_FOUND);
	}
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
		MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		 List<String> errors = new ArrayList<String>();
	     for (FieldError error : ex.getBindingResult().getFieldErrors()) {
	        errors.add(error.getField() + ": " + error.getDefaultMessage());
	     }
	     
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),errors.toString(),request.getDescription(false));
		return new ResponseEntity(exceptionResponse,HttpStatus.BAD_REQUEST);
		//return handleExceptionInternal(ex, exceptionResponse, headers, HttpStatus.BAD_REQUEST, request);
	}
}
