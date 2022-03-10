package com.blz.regexjava;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {

	Scanner sc;

	// User's First Name
	public void firstName() {
		sc = new Scanner(System.in);
		System.out.print("Enter First Name :: ");
		String FirstName = sc.next();
		boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", FirstName);
		if (answer) {
			System.out.println("thank you");
		} else {
			System.out.println("please enter valid first name ");
		}

	}

	// Driver Program
	public class Regex {
		public static void main(String[] args) {
			UserRegistration userRegistration = new UserRegistration();
			userRegistration.firstName();
		}
	}
}