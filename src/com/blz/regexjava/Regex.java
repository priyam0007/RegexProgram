package com.blz.regexjava;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {

	Scanner sc;

	// rule1 = minimum 8 characters & at least 1 upper case at least one numeric
	public void password3() {
		sc = new Scanner(System.in);
		System.out.print("Enter password  :: ");
		String password = sc.nextLine();
		boolean answer = Pattern.matches("^[A-Za-z0-9]+{8,}", password);
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
		userRegistration.password3();
	}
}