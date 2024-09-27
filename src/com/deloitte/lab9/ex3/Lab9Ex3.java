package com.deloitte.lab9.ex3;

import java.util.Scanner;

public class Lab9Ex3 {
	
	interface Authentication {
	    boolean authenticate(String username, String password);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String username = sc.next();
        
        System.out.println("Enter password: ");
        String password = sc.next();
        
        Authentication auth = (un, pd) -> username.equals("sonu") && password.equals("sonu");
        
        if (auth.authenticate(username, password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
        
        sc.close();
    }

   
}