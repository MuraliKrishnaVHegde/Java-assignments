package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Lab2Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array: ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		System.out.println("Enter the elements of the array:");

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		arr = modifyArray(arr);

		System.out.println("Array in Descending Order without duplicates:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
	public static int[] modifyArray(int[] arr) {
		HashSet<Integer> s = new HashSet<>();
		for (int i : arr) {
			s.add(i);
		}

		int[] arr1=new int[s.size()];
		int j=0;
		for (int i : s) {
			arr1[j++] = i;
		}

		Arrays.sort(arr1);
		return arr1;
	}
}
