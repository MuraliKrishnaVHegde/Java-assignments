package com.deloitte.lab6.ex5;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab6Ex5 {
	public static int getSecondSmallest(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        Collections.sort(arr);
        return arr.get(1);
    }
public static void main(String[] args) {
	ArrayList<Integer> arr=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements in an array:");
	int n=sc.nextInt();
	System.out.println("Enter the numbers:");
	for(int i=0;i<n;i++)
		arr.add(sc.nextInt());
    int ss = getSecondSmallest(arr);
    System.out.println("The second smallest element is: " + ss);
    sc.close();
}
}