package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class Lab3Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text (type 'END' on a new line to stop):");

        StringBuilder str = new StringBuilder();
        String s;
        int count = 0;
        
        while (!(s = sc.nextLine()).equals("END")) {
            str.append(s).append("\n");
            count++;
        }

        sc.close();
 
        String s1 = str.toString();
        
      
        int charCount = s1.length(); 
        String[] words = s1.trim().split("\\s+");
        int wordCount = (s1.trim().isEmpty()) ? 0 : words.length;
        

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + count);
    }
}