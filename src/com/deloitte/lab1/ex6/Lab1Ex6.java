package com.deloitte.lab1.ex6;

import java.util.Scanner;

public class Lab1Ex6 {
	int difference = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		Lab1Ex6 obj = new Lab1Ex6();
		obj.calculateDifference(num);
		sc.close();
	}

	public void calculateDifference(int n) {
		difference = sumOfSquares(n) - squareOfSum(n);
		System.out.println("The difference of sum of squares and square of sum of natural numbers in between "+ n + " is: "+ difference);
	}

	public int sumOfSquares(int n) {
		int sum1 = 0;
		for (int i = 1; i <= n; i++)
			sum1 = sum1 + i * i;
		return sum1;
	}

	public int squareOfSum(int n) {
		int sum2 = 0;
		for (int i = 1; i <= n; i++)
			sum2 = sum2 + i;
		return sum2 * sum2;
	}
}
