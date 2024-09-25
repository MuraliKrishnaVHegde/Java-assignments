package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Scanner;

public class Lab6Ex3 {
	public static HashMap<Integer, Integer> getNumberSquares(int[] num) {
		HashMap<Integer, Integer> square = new HashMap<>();
		for (int i : num) {
			square.put(i, i * i);
		}

		return square;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		int[] num =new int[n];
		for(int i=0;i<n;i++)
			num[i]=sc.nextInt();
		HashMap<Integer, Integer> result = getNumberSquares(num);
		for (int key : result.keySet()) {
			System.out.println(key + ": " + result.get(key));
		}
		sc.close();
	}
}