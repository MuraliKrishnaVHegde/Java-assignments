package com.deloitte.lab3.ex8;
import java.util.Scanner;
public class Lab3Ex8 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		if(isPositiveString(str))
			System.out.println(str+" is a positive string");
		else
			System.out.println(str+" is not a positive string");
		sc.close();
	}
	public static boolean isPositiveString(String str)
	{
		boolean flag=true;
		str=str.toLowerCase();
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>str.charAt(i+1))
				flag=false;
		}
		return flag;
	}
}
