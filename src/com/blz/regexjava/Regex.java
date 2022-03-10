package com.blz.regexjava;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {

	Scanner sc;

	// User's Contact Number
	public void contactNumber() {
		sc = new Scanner(System.in);
		System.out.print("Enter contact number with country code :: ");
		String ContactNumber = sc.nextLine();
		boolean answer = Pattern.matches("^[+91]+[789]+[0-9]+{9}+$", ContactNumber);
		if (answer) {
			System.out.println("Thank you");
		} else {
			System.out.println("enter valid contact number");
		}
	}
}

// Driver Program
public class Regex {
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.contactNumber();
	}
}
