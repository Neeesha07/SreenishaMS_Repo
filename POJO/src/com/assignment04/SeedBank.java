package com.assignment04;

import java.util.List;
import java.util.Set;

public class SeedBank {
	private static CustomerDB customerdb = new CustomerDB();
	
	private static Login login = new Login();
	
	public static void printCustomerList(List<Customer> customerlist)
	{
		for(Customer c:customerlist)
			System.out.println("\tCustomer ID: "+c.getCustomerId()+"\tCustomer Name: "+c.getCustomerName()+"Loan Status: "+c.isLoanAvailed());
	}
	
	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Dan", false);
		Customer c2 = new Customer(102, "Nate", true);
		Customer c3 = new Customer(103, "Blair", true);
		Customer c4 = new Customer(104, "Chuck", false);
		
		login.addLogin(101, "Dan");
		login.addLogin(102, "Blair");
		login.addLogin(103, "Drake");
		login.addLogin(104, "Chuck");
		
		customerdb.saveCustomer(c1);
		customerdb.saveCustomer(c2);
		customerdb.saveCustomer(c3);
		customerdb.saveCustomer(c4);
		
		List<Customer> customerList = customerdb.getAllCustomers();
		
		if(customerList.isEmpty())
		{
			System.out.println("No customers in the bank!");
		}
		else {
			printCustomerList(customerList);
		}
		
		Set<Integer> loanAvailedCustomers = customerdb.getLoanAvailedCustomers();

	
		for(Integer c:loanAvailedCustomers)
			System.out.println("CustomerID: "+c.intValue());
		
		
		
	}
}
