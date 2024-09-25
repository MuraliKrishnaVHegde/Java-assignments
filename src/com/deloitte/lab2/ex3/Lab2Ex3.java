package com.deloitte.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int num = sc.nextInt();
		System.out.println("Enter the numbers of the array:");
		int[] arr = new int[num];
		for (int i = 0; i < num; i++)
			arr[i] = sc.nextInt();
		arr=getSorted(arr);
		for(int i:arr)
			System.out.println(i);
		sc.close();
	}
	public static int[] getSorted(int[] arr)
	{
		StringBuilder str=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			str.append(arr[i]);
			str.reverse();
			arr[i]=Integer.parseInt(str.toString());
			str.setLength(0);
		}
		Arrays.sort(arr);
		return arr;
	}
}
