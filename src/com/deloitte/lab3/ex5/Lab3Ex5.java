package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class Lab3Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text (type 'END' on a new line to stop):");

        StringBuilder text = new StringBuilder();
        String line;
        int lineCount = 0;
        
        while (!(line = sc.nextLine()).equals("END")) {
            text.append(line).append("\n");
            lineCount++;
        }

        sc.close();
 
        String fullText = text.toString();
        
      
        int charCount = fullText.length(); 
        String[] words = fullText.trim().split("\\s+");
        int wordCount = (fullText.trim().isEmpty()) ? 0 : words.length;
        

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}