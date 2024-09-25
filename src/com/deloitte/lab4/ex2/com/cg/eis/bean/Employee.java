package com.deloitte.lab4.ex2.com.cg.eis.bean;


public class Employee {
	public int id;
	public String name,designation,insurancescheme;
	public double salary;
	public Employee(int id, String name, String designation,String insurancescheme,double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.insurancescheme = insurancescheme;
		this.salary = salary;
	}
	
}