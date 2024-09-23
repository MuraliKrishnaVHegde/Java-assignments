package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class Lab3Ex4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("New number after modification: " + modifyNumber(num));
	}

	public static int modifyNumber(int num1) {

		String str = Integer.toString(num1);
		StringBuilder str1 = new StringBuilder();

		for (int i = 0; i < str.length() - 1; i++) {
			int n1 = Character.getNumericValue(str.charAt(i));
			int n2 = Character.getNumericValue(str.charAt(i + 1));

			int diff = Math.abs(n1 - n2);
			str1.append(diff);
		}

		str1.append(str.charAt(str.length() - 1));

		return Integer.parseInt(str1.toString());
	}

}