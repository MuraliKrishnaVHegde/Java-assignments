package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Scanner;

public class Lab6Ex2 {
	public static HashMap<Character, Integer> countChars(char[] arr) {
		HashMap<Character, Integer> ccmap = new HashMap<>();

		for (char c : arr) {
			if (ccmap.containsKey(c)) {
				ccmap.put(c, ccmap.get(c) + 1);
			} else {
				ccmap.put(c, 1);
			}
		}

		return ccmap;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in a character array:");
		int num = sc.nextInt();
		System.out.println("Enter the characters:");
		char[] chararr = new char[num];
		for(int i=0;i<num;i++)
			chararr[i]=sc.next().charAt(0);

		HashMap<Character, Integer> count = countChars(chararr);

		for (char key : count.keySet()) {
			System.out.println(key + ": " + count.get(key));
		}
		sc.close();
	}
}