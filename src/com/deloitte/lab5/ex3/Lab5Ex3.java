package com.deloitte.lab5.ex3;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Lab5Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        try {
            validateSalary(salary);
            System.out.println("The employee's salary is valid: " + salary);
        } catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    public static void validateSalary(double salary) throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary must be at least 3000.");
        }
    }
}