package com.crud.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Passport implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "passport_number")
	private String passportNumber;

	@OneToOne(mappedBy = "passport")
	@JsonBackReference
	private Student student;
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNumber=" + passportNumber + "]";
	}

	public Passport(int id, String passportNumber) {
		this.id = id;
		this.passportNumber = passportNumber;
	}

	public Passport() {
		
	}
}
