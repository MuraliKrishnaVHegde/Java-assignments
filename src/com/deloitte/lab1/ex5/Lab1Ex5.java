package com.deloitte.lab1.ex5;
import java.util.Scanner;
public class Lab1Ex5 {
	static int sum=0;
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numebr:");
		int num=sc.nextInt();
		int sum1=Lab1Ex5.calculateSum(num);
		System.out.println("The sum of natural numbers divisible by 3 and 5 in between" + num + " is: " + sum1);
		sc.close();
	}
	public static int calculateSum(int n)
	{
		for(int i=3;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
				
		}
		return sum;
	}
}
