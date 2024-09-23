package com.deloitte.lab2.ex1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Lab2Ex1 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int num=sc.nextInt();
		System.out.println("Enter the numbers of the array");
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=sc.nextInt();
		System.out.println("The second smallest number in the array is: "+ getSecondSmallest(arr));
		sc.close();
	}
	public static int getSecondSmallest(int[] arr1)
	{
		Arrays.sort(arr1);
		return arr1[1];
	}
}
//	static ArrayList<Integer> arr=new ArrayList<>();
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the length of the array");
//		int num=sc.nextInt();
//		System.out.println("Enter the numbers of the array");
//		for(int i=0;i<num;i++)
//			arr.add(sc.nextInt());
//		System.out.println(getSecondSmallest(arr));	
//	}
//	static int getSecondSmallest(ArrayList<Integer> n)
//	{
//		n.sort(null);
////		Collections.sort(n);
//		return n.get(1);
//	}
//}
