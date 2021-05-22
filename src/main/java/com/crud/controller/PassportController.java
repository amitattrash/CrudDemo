package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.beans.Passport;
import com.crud.service.PassportService;

@RestController
public class PassportController {
	@Autowired
	private PassportService passportService;
	
	@GetMapping("/Passport/{id}")
	public Passport getPassport(@PathVariable int id) {
		return passportService.getPassport(id);
	}
}
