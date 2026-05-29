package com.Statements;

import java.util.Scanner;

public class WithOutBreak {

	public static void main(String[] args) {
		// switch cases for weekdays
		System.out.print("Enter the day : ");
		Scanner sc = new Scanner(System.in);
		String week = sc.nextLine();
		//without break goes to fall-through
		
		switch (week) {
		case "Monday":
			System.out.println("Monday");
		case "Tuesday":
			System.out.println("Tuesday");
		case "Wednesday":
			System.out.println("Wednesday");
		case "Sunday":
			System.out.println("Sunday");
		default:                            //if input doesn't match print default value
			System.out.println("Invalid Input");

		}
		sc.close();
	}
}
