package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class Lab1Ex4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		Lab1Ex4.Calculate(num);
		sc.close();
	}

	public static void Calculate(int num) {
		int count = 0;
		if (num <= 1) {
			System.out.println("No prime numbers in between " + num);
		} else {
			System.out.println("The prime numbers in between " + num + " are: ");
			for (int i = 2; i <= num; i++) {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count = 1;
						break;
					}
				}
				if (count == 0) {
					System.out.print(i + " ");
				}
				count = 0;
			}
		}
	}
}
