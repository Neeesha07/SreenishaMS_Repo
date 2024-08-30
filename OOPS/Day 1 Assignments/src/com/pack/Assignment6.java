package com.pack;

public class Assignment6 {
public static void main(String[] args) {
	int intVal=10;
	float floatVal=10.0f;
	boolean bool1=false;
	boolean bool2=true;
	boolean bool3=false;
	System.out.println("Arithmetic:\n"+intVal+"%"+floatVal+"="+(intVal%floatVal));
	System.out.println("Concatenation:\nDay "+2+" Session");
	System.out.println("\n"+2+3+"\n"+(2+3));
	System.out.println();
	
	System.out.println("Relational \n"+intVal+"=="+floatVal+"="+(intVal==floatVal));
	floatVal=5.0f;
	System.out.println(intVal+"=="+floatVal+"="+(intVal==floatVal));
	System.out.println();
	
	if(bool1||(bool1 && (bool2=false))) {
		System.out.println("Success");
	}
	else {
		System.out.println("Failiure");
	}
	System.out.println("bool2 value: "+bool2);
	}
}

