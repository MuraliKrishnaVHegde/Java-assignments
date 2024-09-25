package com.deloitte.lab4.ex3;

import java.util.*;

public class Lab4Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the list of items available in the library");
		System.out.println("1. Book");
		System.out.println("2. JournalPaper");
		System.out.println("3. Video");
		System.out.println("4. CD");
		for (;;) {

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Your choice is book");
				Book bookObj = new Book(0, null, 0);
				bookObj.addDetails();
				bookObj.printDetails();
				break;

			case 2:
				System.out.println("Your choice is journal paper");
				Journal journalObj = new Journal(0, null, 0);
				journalObj.addDetails();
				journalObj.printDetails();
				break;

			case 3:
				System.out.println("Your choice is CD");
				CD cdObj = new CD(0, null, 0);
				cdObj.addDetails();
				cdObj.printDetails();
				break;

			case 4:
				System.out.println("Your choice is Video");
				Video videoObj = new Video(0, null, 0);
				videoObj.addDetails();
				videoObj.printDetails();
				break;

			default:
				System.out.println("Enter a correct choice");
				break;
			}
			System.out.println("Do you want to continue[Y/N or y/n]");
			char ch = sc.next().charAt(0);
			if (ch == 'Y' || ch == 'y') {
				continue;
			} else {
				System.exit(0);
			}
			sc.close();
		}

	}

}