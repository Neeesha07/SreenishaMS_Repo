package com;

import java.util.ArrayList;
import java.util.List;

public class Assignment01 {
	public static void printCustomers(List<String> cl) {
		for(String s:cl)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		List<String> customers = new ArrayList<String>();
		
		customers.add("Dan");
		customers.add("Nate");
		customers.add("Chuck");
		customers.add("Bass");
		
		printCustomers(customers);
	}
}
