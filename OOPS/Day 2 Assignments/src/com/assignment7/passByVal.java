package com.assignment7;

import com.assignment5.Student;

public class passByVal {
	public static void main(String[] args) {
		passByVal val = new passByVal();
		Student st1=new Student();
		int sId = st1.getStudentId();
		System.out.println(sId);
		val.passTheValue(st1);
		sId = st1.getStudentId();
		System.out.println("the sId are: " + sId);
	}

	public void passTheValue(Student st1) {
		// TODO Auto-generated method stub
		st1.setStudentId(10);
		int sId=st1.getStudentId();
		System.out.println("the sId are: " + sId);
	}
}
