package com.pack;

public class Assignment7 {
public static void main(String[] args) {
	boolean bool1=true;
	boolean bool2=true;
	boolean bool3=true;
	
	if(bool1&&(bool3&&bool2)) {
		System.out.println("Success");
	}
	else {
		System.out.println("Failiure");
	}
	System.out.println("bool2 value: "+bool2);
}
}
