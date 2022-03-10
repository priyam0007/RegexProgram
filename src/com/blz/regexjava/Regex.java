package com.blz.regexjava;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {

	Scanner sc;

	// Validate the given email IDs in sheet
	public void emailValidation() {
		sc = new Scanner(System.in);
		System.out.print("Enter email ID :: ");
		String Email = sc.next();
		Boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", Email);
		if (answer) {
			System.out.println("Thank you");
		} else {
			System.out.println("enter valid password");
		}
	}
}

// Driver Program
public class Regex {
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.emailValidation();
	}
}