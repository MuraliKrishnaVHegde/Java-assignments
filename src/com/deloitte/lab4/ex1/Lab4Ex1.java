package com.deloitte.lab4.ex1;

import java.util.Scanner;
public class Lab4Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter details for Smith's account:");
		System.out.print("Age: ");
		float smithage = sc.nextFloat();
		
		Person smith = new Person("Smith", smithage);
		Account smithacc = new SavingsAccount(smith, 2000.0);
		smithacc.deposit(2000.0);
		System.out.println("Smith's account balance: " + smithacc.getBalance());
		
		System.out.println("Enter details for Kathy's account:");
		System.out.print("Age: ");
		float kathyage = sc.nextFloat();

		Person kathy = new Person("Kathy", kathyage);
		Account kathyacc = new SavingsAccount(kathy,3000.0);
		kathyacc.withdraw(2000.0);

		System.out.println("Kathy's account balance: " + kathyacc.getBalance());

		sc.close();
	}
}

class Person {
	private String name;
	private float age;

	public Person(String name, float age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public float getAge() {
		return age;
	}
}

abstract class Account {
	private static long nextAccNum = 1000;
	private long accNum;
	protected double balance;
	private Person accHolder;

	public Account(Person accHolder, double balance) {
		this.accNum = nextAccNum++;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public abstract void withdraw(double amount);
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}

	public double getBalance() {
		return balance;
	}
	public void setAccNum(long accNum)
	{
		this.accNum=accNum;
	}

	public long getAccNum() {
		return accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}
}

class SavingsAccount extends Account {
	private static final double MINIMUM_BALANCE = 500.0;

	public SavingsAccount(Person accHolder, double balance) {
		super(accHolder, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= MINIMUM_BALANCE) {
			balance -= amount;
		} else {
			System.out.println("Withdrawal failed: Savings Account requires a minimum balance of INR 500.");
		}
	}
}

class CurrentAccount extends Account {
	private double overdraftLimit;

	public CurrentAccount(Person accHolder, double balance, double overdraftLimit) {
		super(accHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit - amount >= 0) {
			balance -= amount;
		} else {
			System.out.println("Withdrawal failed: Overdraft limit reached.");
		}
	}
}
