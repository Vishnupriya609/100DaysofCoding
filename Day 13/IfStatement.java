package com.Statements;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		//find a positive number
		
		if (num > 0){
			System.out.println("Positive number");
		}
		
		if (num == 0) {
			System.out.println("Zero");
			
		}
		if (num < 0)       
			System.out.println("Negative number");  // for one statement no need curly braces 
		                                           // more statements identation doesn't works
		
		sc.close();

	}

}
