package com.deloitte.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a line of integers:");
        String input = sc.next();
        
        
        StringTokenizer s = new StringTokenizer(input, " ");
        
        int sum = 0;  
        
        
        System.out.println("The integers are:");
        while (s.hasMoreTokens()) {
            
            String token = s.nextToken();
            int num = Integer.parseInt(token);
            
            
            System.out.println(num);
            
            
            sum += num;
        }
        
        
        System.out.println("Sum of all integers: " + sum);
        
        
        sc.close();
    }
}