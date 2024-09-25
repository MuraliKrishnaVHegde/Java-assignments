package com.deloitte.lab6.ex4;

import java.util.HashMap;

public class Lab6Ex4 {
	public static HashMap<String, String> getStudents(HashMap<String, Integer> smarks) {
		HashMap<String, String> medal = new HashMap<>();
		for (String rn : smarks.keySet()) {
			int marks = smarks.get(rn);

			if (marks >= 90) {
				medal.put(rn, "Gold");
			} else if (marks >= 80 && marks < 90) {
				medal.put(rn, "Silver");
			} else if (marks >= 70 && marks < 80) {
				medal.put(rn, "Bronze");
			}
		}
		return medal;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> students = new HashMap<>();
		students.put("S1", 70);
		students.put("S2", 100);
		students.put("S3", 97);
		students.put("S4", 86);
		students.put("S5", 87);
		
		HashMap<String, String> details = getStudents(students);

		for (String str : details.keySet()) {
			System.out.println("Student Registration No: " + str + " | Medal: " + details.get(str));
		}
	}
}