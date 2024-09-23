package com.deloitte.lab1.ex3;
import java.util.Scanner;
public class Lab1Ex3 {
public static void main(String[] args)
{
	Lab1Ex3 obj=new Lab1Ex3();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number till where you want to get your fibonacci series");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	System.out.print(obj.recursive(i)+ " ");
	}
	System.out.println("\n");
	obj.nonrecursive(n);
	sc.close();
}
public void nonrecursive(int n)
{
	int n1=1,n2=1,count=n,n3=0;
	System.out.print(n1+" "+n2+" ");
	for(int i=2;i<count;i++)
	{
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
	}
}
public int recursive(int n)
{
	if(n<=1)
		return n;
	else
		return recursive(n-1)+recursive(n-2);
}
}
