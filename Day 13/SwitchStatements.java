package com.Statements;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		// switch cases for weekdays
		System.out.print("Enter the weekday : ");
		Scanner sc = new Scanner(System.in);
		String week = sc.nextLine();
		
		
		switch (week) {
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Sunday":
			System.out.println("Sunday");
			break;
		default:                            //if input doesn't match print default value
			System.out.println("Invalid Input");

		}
		sc.close();
	}
}
