package com.assignment4;

public class CourseManagement {
public static void main(String[] args) {
	Student st1 = new Student();
	st1.setStudentId(101);
	st1.setStudentType('A');
	System.out.println("Student Details :\nStudent Id: "+st1.getStudentId()+"\nStudent Type: "+st1.getStudentType());
}
}
