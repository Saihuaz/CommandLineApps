package com.mypractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
	
	private ArrayList<Customer> customers= new ArrayList<>();
	private Scanner myScanner = new Scanner(System.in);
	private String branchName;
	
	public Branch(String name) {
		this.branchName=name;
	}
	
	public void branchDash() {
		System.out.println("Choose an option below \n" + "1: Show all customers | 2: Add new customer | 3: Delete a Customer | 4:Exit ");
		int input = myScanner.nextInt();
		switch(input){
			case 1: showAllCustomer();
			break;
			case 2: addNewCustomer();
			break;
			case 3: deleteCustomer();
			break;
			case 4: break;
		}
	}
	
	public String getBranchName() {
		return this.branchName;
	}
	
	public void showAllCustomer() {
		for (int i=0; i<customers.size();i++) {
			System.out.println(i+" "+customers.get(i).toString());
		}
	}
	
	public  void addNewCustomer() {
		System.out.println("Enter name of new customer");
		String name = myScanner.next();
		customers.add(new Customer(name));
		System.out.println(name+" has been successfully added");
		myScanner.nextLine();
	}
	public void deleteCustomer() {
		System.out.println("Enter customer's number to be removed");
		int index = myScanner.nextInt();
		System.out.println(customers.get(index).toString() +" successfully removed.");
		customers.remove(index);
	}

}
