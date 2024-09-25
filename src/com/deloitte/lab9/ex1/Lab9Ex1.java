package com.deloitte.lab9.ex1;

import java.util.Scanner;

public class Lab9Ex1 {
	interface Exponent {
        int exponent(int a, int b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Exponent p = (x,y) -> (int) Math.pow(x, y);
        
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        
        System.out.println("The value of " + x + "^" + y + " is: " + p.exponent(x, y));
        
        sc.close();
    }

    
}