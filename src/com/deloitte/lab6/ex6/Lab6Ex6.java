package com.deloitte.lab6.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex6 {
	public static List<String> getEligibleVoters(Map<String, Integer> people) {
		List<String> eligiblevoterselect = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : people.entrySet()) {
			String id = entry.getKey();
			int age = entry.getValue();

			if (age > 18) {
				eligiblevoterselect.add(id);
			}
		}

		return eligiblevoterselect;
	}

	public static void main(String[] args) {
		Map<String, Integer> people = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of people:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the id for person"+i);
			String id=sc.next();
			System.out.println("Enter the age of person"+i);
			int age=sc.nextInt();
			people.put(id,age);
		}
		sc.close();

		for (Map.Entry<String, Integer> entry : people.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		List<String> eligiblevoters = getEligibleVoters(people);

		System.out.println("Eligible Voters' IDs: " + eligiblevoters);
	}
}
