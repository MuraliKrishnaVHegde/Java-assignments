package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab3Ex9 {
	 public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.println("Enter a date in the format dd-MM-yyyy:");
	        String inputDate = scanner.nextLine();
	        
	        
	        calculateDuration(inputDate);
	        
	       
	        scanner.close();
	    }

    public static void calculateDuration(String inputDate) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate inputLocalDate = LocalDate.parse(inputDate, formatter);
        
      
        LocalDate currentDate = LocalDate.now();
        
  
        Period period = Period.between(inputLocalDate, currentDate);
        
       
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        
       
        System.out.println("Duration from " + inputDate + " to current date:");
        System.out.println(years + " years, " + months + " months, " + days + " days");
    }
}