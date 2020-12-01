package com.mypractice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MobilePhone {

	private static Scanner myScanner = new Scanner(System.in);

	public static void prePopulateList(ArrayList<String> phoneStuff) {
		// Filler contacts
		phoneStuff.add("Leonardo");
		phoneStuff.add("Milo");
		phoneStuff.add("Donatello");
		phoneStuff.add("Raphael");
		phoneStuff.add("Michelangelo");
	}

	public static void askUser(ArrayList<String> stuffIn) {

		boolean end = true;
		int input = 0;
		while (end) {
			System.out.println("Select one of the options below \n" + "1:Contacts | " + "2:Add new Contact | "
					+ "3:Update Contact | " + "4:Delete Contact | " + "5:Exit | ");
			//Try catch if user enters a non number
			try {
				input = myScanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid number");
			}
			myScanner.nextLine(); //clears buffer to avoid infinite loop when exception is caught
			// Check for Exit
			if (input == 5) {
				System.out.println("Goodbye :)");
				end = false;
			} else {
				optionSelect(input, stuffIn);
			}

		}

	}

	public static void optionSelect(int in, ArrayList<String> stuffIn) {
		switch (in) {
		case 1:
			printAllContact(stuffIn);
			break;

		case 2:
			addNewContact(stuffIn);
			break;

		case 3:
			updateContact(stuffIn);
			break;

		case 4:
			deleteContact(stuffIn);
			break;

		}

	}

	public static void printAllContact(ArrayList<String> stuffIn) {
		for (int i = 0; i < stuffIn.size(); i++) {
			System.out.println(i + " " + stuffIn.get(i).toString());
		}
	}

	public static void addNewContact(ArrayList<String> stuffIn) {
		System.out.println("Enter new contact: ");
		String input = myScanner.next();
		stuffIn.add(input);
		System.out.println(input + " successfuly added.");
	}

	public static void updateContact(ArrayList<String> stuffIn) {
		System.out.println("Enter select index of contact to update");
		int index = myScanner.nextInt();
		System.out.println("Enter new name");
		String input = myScanner.next();
		stuffIn.set(index, input);
		System.out.println("Name successfuly changed to " + input);
	}

	public static void deleteContact(ArrayList<String> stuffIn) {
		System.out.println("Enter the Index of the name you wish to delete");
		int index = myScanner.nextInt();
		System.out.println(stuffIn.get(index).toString() + " sucessfuly removed");
		stuffIn.remove(index);
	}

}
