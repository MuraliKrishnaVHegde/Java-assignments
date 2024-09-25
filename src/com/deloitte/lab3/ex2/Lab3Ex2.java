package com.deloitte.lab3.ex2;

import java.util.Scanner;

public class Lab3Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.next();
		System.out.println("Output: " + getImage(input));
		sc.close();

	}

	public static String getImage(String str) {

		StringBuffer s = new StringBuffer(str);

		String reversedstr = s.reverse().toString();

		return str + "|" + reversedstr;
	}

}
