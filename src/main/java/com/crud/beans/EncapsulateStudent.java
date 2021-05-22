package com.crud.beans;

public class EncapsulateStudent {
	private String studentName;
	private int roll;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}	
}
class TestEncapsulation {
	public static void main(String[] args)
	{
		EncapsulateStudent obj = new EncapsulateStudent();
		obj.setStudentName("Harsh");
		obj.setRoll(51);
		System.out.println("Student's name: " + obj.getStudentName());
		System.out.println("Student's roll: " + obj.getRoll());		
	}
}
