package com.assignment7;

public class Student {
	private int studentId;
	 private char studentType;
	 Student(){
		 studentId=100;
		 studentType='B';
	 }
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

}
