package com.deloitte.lab1.ex7;
import java.util.Scanner;
public class Lab1Ex7 {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	Lab1Ex7 obj= new Lab1Ex7();
	if(obj.checkNumber(num))
		System.out.println("The number "+num+" is an increasing number.");
	else
		System.out.println("The number "+num+" is not an increasing number.");
	sc.close();
}
public boolean checkNumber(int n)
{
	boolean flag=true;
//	int temp=n/10,n1=n%10,n2=0;
//	while(temp!=0)
//	{
//		n2=temp%10;
//		if(n2>n1)
//		{
//			flag=false;
//			break;
//		}
//		n1=n2;
//		temp=temp/10;
//	}
	
	String numbertostring =Integer.toString(n);
	for(int i=0;i<numbertostring.length()-1;i++)
	{
		if(numbertostring.charAt(i)>numbertostring.charAt(i+1))
			flag=false;
	}
	
	if(flag)
	return true;
	else
		return false;
	}
}
