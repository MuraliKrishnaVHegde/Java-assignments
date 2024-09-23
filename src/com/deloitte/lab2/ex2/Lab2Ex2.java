package com.deloitte.lab2.ex2;

import java.util.Scanner;
import java.util.Arrays;

public class Lab2Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int num = sc.nextInt();
		String[] str = new String[num];
		System.out.println("Enter the names:");
		for(int i=0;i<str.length;i++)
			str[i]=sc.next();
		str = sortStrings(str);
		for (String i : str)
			System.out.print(i+" ");
		sc.close();
	}

	public static String[] sortStrings(String[] str) {
		Arrays.sort(str);
		if (str.length % 2 == 0)
			 sortStringsEven(str);
		else
			sortStringsOdd(str);
		return str;
	}
	public static String[] sortStringsEven(String[] str)
	{
		for(int i=0;i<str.length/2;i++)
			str[i]=str[i].toUpperCase();
		return str;
	}
	public static String[] sortStringsOdd(String[] str)
	{
		for(int i=0;i<str.length/2+1;i++)
			str[i]=str[i].toUpperCase();
		return str;
	}
}
