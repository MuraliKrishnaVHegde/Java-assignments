package com.deloitte.lab9.ex2;

import java.util.Scanner;

public class Lab9Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.next();
        
        StringFormatter strformat = (str) -> String.join(" ", str.split(""));
        
        System.out.println("Formatted string: " + strformat.format(s));
        
        sc.close();
    }

    interface StringFormatter {
        String format(String str);
    }
}