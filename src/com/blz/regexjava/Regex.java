package com.blz.regexjava;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {

	Scanner sc;

	// User's Last Name
	public void email() {
		sc = new Scanner(System.in);
		System.out.print("Enter email ID :: ");
		String Email = sc.next();
		Boolean answer = Pattern.matches("^[a-zA-Z.]+[a-z0-9]+@[A-za-z.]+[a-z]+$", Email);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid email ID ");
		}
	}
}

// Driver Program
public class Regex {
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		// userRegistration.firstName();
		userRegistration.email();
	}
}
