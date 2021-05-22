package com.crud.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Name is mandatory")
	@Column(name = "student_name")
	private String name;
	
	@Id
	private int roll;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JsonManagedReference
	private Passport passport;
	
	
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", passport=" + passport + "]";
	}
	
}
