package com.deloitte.lab1.ex8;
import java.util.Scanner;
public class Lab1Ex8 {
	public static void main(String[] args)
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		if(chechNumber(num))
		 System.out.println("The number "+num+" is a power of 2.");
		else
			System.out.println("The number "+num+" is a not power of 2.");
		sc.close();
				
	}
public static boolean chechNumber(int n)
{
	if(n==0)
		return false;
	if(Math.ceil((Math.log(n) / Math.log(2)))
    == (Math.floor(
            ((Math.log(n) / Math.log(2))))))
			return true;
	else
		return false;
}
}
