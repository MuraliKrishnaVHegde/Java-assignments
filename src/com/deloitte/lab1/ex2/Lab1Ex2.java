package com.deloitte.lab1.ex2;
import java.util.Scanner;
public class Lab1Ex2 {
	public static void main(String[] args) {
			System.out.println("Enter your choice:");
			System.out.println("1.Red");
			System.out.println("2.Yellow");
			System.out.println("3.Green");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Stop");
			break;
			case 2: System.out.println("ready");
			break;
			case 3: System.out.println("go");
			break;
			default: System.out.println("Please enter correct choice");
			}
			sc.close();
	}
}
