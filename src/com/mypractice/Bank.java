package com.mypractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	
	private Scanner myScanner = new Scanner(System.in);
	private String branchName;
	private ArrayList<Branch> branch = new ArrayList <>();
	
	public Bank(String branchName) {
		this.branchName=branchName;
	}
	
	public void bankDash() {
		System.out.println("Choose an option below \n" +"1: Show all branches | 2: Add new branch | 3:Delete branch 4: ");
		int input = myScanner.nextInt();
		switch(input) {
		case 1: showAllBranches();
		break;
		case 2: addNewBranch();
		break;
		case 3: deleteBranch();
		break;
		case 4: break;
		}
		
	}
	
	public String getBranchName() {
		return this.branchName;
	}
	
	public void showAllBranches() {
		for(int i=0; i<branch.size();i++) {
			System.out.println(i+" "+branch.get(i));
		}
	}
	
	public void addNewBranch() {
		System.out.println("Enter New branch name");
		String name = myScanner.next();
		branch.add(new Branch(name));
	}

	public void deleteBranch() {
		System.out.println("Enter Branch number for deletion");
		int index = myScanner.nextInt();
		System.out.println(branch.get(index) + "successfully removed");
		branch.remove(index);
	}
	

}