package com.Statements;
import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// if inside another if statements
		//using scanner class
		// interview result
		Scanner sc = new Scanner(System.in);
		System.out.println("online assessment result pass or fail: ");
		String onlineAssessment = sc.nextLine();
		
		//.equals() is used for string comparsion
		if (onlineAssessment .equals("pass")) {
			System.out.println("Please wait for futher rounds");


			System.out.println("Enter the round1Status: ");
			String round1Status = sc.nextLine();

			if(round1Status.equals("pass")) {
				System.out.println("Please wait for round 2");
				System.out.println("Enter the round2Status: ");
				String round2Status =  sc.nextLine();
				
				if(round2Status.equals("pass")) {
					System.out.println("Please wait for HR round");
					
				}
				else {
					System.out.println("You can go to home");
				}
				
			}
			else {
				System.out.println("you can go to home");
			}
			
					

		}

		else {
			System.out.println("Please go to home");

		}


	}

}
