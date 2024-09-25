package com.deloitte.lab4.ex2.com.cg.eis.pl;

import java.util.Scanner;

import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;
import com.deloitte.lab4.ex2.com.cg.eis.service.EmployeeServiceImplementation;

public class EmployeeDetails {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter employee salary");
		double salary = sc.nextDouble();
		System.out.println("Enter employee name");
		String name = sc.next();

		EmployeeServiceImplementation emp = new EmployeeServiceImplementation(id,salary,name);
		Employee emp1 = emp.getEmpDetails();
		String scheme = emp.insuranceScheme(emp1.designation, emp1.salary);
		Employee person = new Employee(emp1.id, emp1.name, emp1.designation, scheme, emp1.salary);

		// System.out.println(emp1.name);
		// emp.insuranceScheme();
		emp.EmpDetails(person);
		sc.close();
	}
}