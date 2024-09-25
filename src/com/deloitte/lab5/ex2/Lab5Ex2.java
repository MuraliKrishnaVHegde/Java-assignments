package com.deloitte.lab5.ex2;

import java.util.Scanner;

class InvalidNameException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String message) {
		super(message);
	}
}

public class Lab5Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String fn = sc.nextLine();

		System.out.print("Enter your last name: ");
		String ln = sc.nextLine();

		try {
			validateName(fn, ln);
			System.out.println("Valid full name!");
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

	public static void validateName(String fn, String ln) throws InvalidNameException {
		if (fn.trim().isEmpty() || ln.trim().isEmpty()) {
			throw new InvalidNameException("Invalid name: First and last names cannot be blank.");
		}
	}
}