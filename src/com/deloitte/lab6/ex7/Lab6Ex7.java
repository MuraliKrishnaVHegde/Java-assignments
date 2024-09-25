package com.deloitte.lab6.ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lab6Ex7 {
	public static int[] reverseAndSortArray(int[] arr) {
		List<Integer> revnumarr = new ArrayList<>();
		for (int num : arr) {
			String revstr = new StringBuilder(String.valueOf(num)).reverse().toString();
			int revnum = Integer.parseInt(revstr);

			revnumarr.add(revnum);
		}
		Collections.sort(revnumarr);
		int[] res = revnumarr.stream().mapToInt(i -> i).toArray();
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n=sc.nextInt();
		int[] arrnum=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
			arrnum[i]=sc.nextInt();
		int[] sortedarr = reverseAndSortArray(arrnum);
		System.out.println("Input Array: " + Arrays.toString(arrnum));
		System.out.println("Reversed and Sorted Array: " + Arrays.toString(sortedarr));
		sc.close();
	}
}