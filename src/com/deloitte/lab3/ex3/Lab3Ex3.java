package com.deloitte.lab3.ex3;

import java.util.Scanner;

public class Lab3Ex3 {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		System.out.println("Modified string: " + alterString(str));
		sc.close();
	}

	public static String alterString(String str) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (checkConsonant(ch)) {

				ch = (char) (ch + 1);
			}

			result.append(ch);
		}

		return result.toString();
	}

	public static boolean checkConsonant(char ch) {

		ch = Character.toLowerCase(ch);

		return ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}
}