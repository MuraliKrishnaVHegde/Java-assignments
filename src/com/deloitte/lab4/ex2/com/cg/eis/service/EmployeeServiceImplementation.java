package com.deloitte.lab4.ex2.com.cg.eis.service;
import com.deloitte.lab4.ex2.com.cg.eis.bean.Employee;

public class EmployeeServiceImplementation implements EmployeeService{
	int id;
	double salary;
	String name;
	public EmployeeServiceImplementation(int id,double salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	public Employee getEmpDetails() {
		String designation;
		String insuranceScheme = null;
		if(salary<5000){
			designation = "Substaff";
		}
		else if(salary>5000&&salary<20000){
			designation = "Accountant";
		}
		else if(salary>=20000&&salary<40000){
			designation = "Department Lead";
		}
		else{
			designation = "Office Head";
		}
		
		Employee emp = new Employee(id,name,designation,insuranceScheme,salary);
		return emp;
			
		}
	
	public String insuranceScheme(String designation,double salary) {
		String scheme;
		if(designation == "Substaff")
			scheme = "No Scheme";
		else if(designation == "Accountant")
			scheme = "Scheme 3";
		else if(designation == "Department Lead")
			scheme = "Scheme 2";
		else
			scheme = "Scheme 1";
		return scheme;
	}
	
	public void EmpDetails(Employee emp) {
		System.out.println("Employee id "+emp.id);
		System.out.println("Employee name "+emp.name);
		System.out.println("Employee designation "+emp.designation);
		System.out.println("Employee salary "+emp.salary);
		System.out.println("Employee insurancescheme "+emp.insurancescheme);
		
	}


}