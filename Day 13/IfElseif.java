package com.Statements;
import java.util.Scanner;

public class IfElseif {

	public static void main(String[] args) {
		// using scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Marks: ");
		
		int Marks = sc.nextInt();
		//student grading System
		if (Marks >= 85) {
			System.out.println("Grade A");
		}
		else if (Marks >= 70) {
			System.out.println("Grade B");
		}
		else if (Marks >= 60) {
			System.out.println("Grade C");
		}
		else if (Marks >= 35) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();
		

	}

}
