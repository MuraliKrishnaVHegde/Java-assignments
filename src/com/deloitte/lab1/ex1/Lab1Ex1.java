package com.deloitte.lab1.ex1;
import java.util.Scanner;
public class Lab1Ex1 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int temp=num,num1=0;
	while(temp>0)
	{
	   num1=num1+(int)Math.pow((temp%10),3);
	   temp=temp/10;
	}
	System.out.println("The sum of the cubes of the "+num+" number is "+ num1);
	sc.close();
}
}
