package com.deloitte.lab9.ex5;

import java.util.function.Function;

public class Lab9Ex5 {
	public static int calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * calculateFactorial(n - 1);
	}

	public static void main(String[] args) {
		Function<Integer, Integer> factorialFunc = Lab9Ex5::calculateFactorial;

		int num = 8;
		int res = factorialFunc.apply(num);

		System.out.println("Factorial of " + num + " is: " + res);
	}
}