package com.blz.regexjava;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {

	Scanner sc;

	// User's Last Name
	public void lastName() {
		sc = new Scanner(System.in);
		System.out.print("Enter Last Name :: ");
		String LastName = sc.next();
		boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", LastName);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid last name ");
		}

	}
}

// Driver Program
public class Regex {
	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.lastName();
	}
}
