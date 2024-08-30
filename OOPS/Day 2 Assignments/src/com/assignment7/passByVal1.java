package com.assignment7;

import com.assignment5.Student;

public class passByVal1 {
	public static void main(String[] args) {
		int sId=25;
		passByVal1 val = new passByVal1();
		System.out.println(sId);
		val.passTheValue(sId);
		System.out.println("the sId are: " + sId);
	}

	public void passTheValue(int sId) {
		// TODO Auto-generated method stub
		sId=10;
		System.out.println("the sId are: " + sId);
	}
}
