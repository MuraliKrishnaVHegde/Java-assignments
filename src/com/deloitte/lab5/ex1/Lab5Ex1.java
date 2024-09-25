package com.deloitte.lab5.ex1;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
		super(message);
	}
}

public class Lab5Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		try {
			validateAge(age);
			System.out.println("The person is an adult");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException(
					"Minor and person'age must be greater than or equal to 18 to become an adult.");
		}
	}
}