package com.mypractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	
	Scanner myScanner = new Scanner(System.in);	
	private String customerName;
	
	private ArrayList <Double> transaction = new ArrayList<>();

	public Customer (String customerName) {
		this.customerName= customerName;
	}
	
	public void customerDash() {
		System.out.println("Choose an option below \n"+"1:Show all customer | 2:Add new customer | 3:Exit");
		int input=myScanner.nextInt();
		switch(input){
		case 1: showAllCustomerTransaction();
		break;
		case 2: addNewTransaction();
		break;
		case 3: break;
		}

		
	}
	
	public String getName() {
		return this.customerName;
	}
	public void showAllCustomerTransaction() {
		for(int i=0; i<transaction.size();i++) {
			System.out.println(i+" "+transaction.get(i));
		}
	}
	public void addNewTransaction() {
		System.out.println("Enter new transaction amount");
		double amount = myScanner.nextDouble();
		transaction.add(amount);
	}

}
