package com.Statements;

import java.util.Scanner;

public class IfelseStatements {

	public static void main(String[] args) {
		// define & assign the variable
        int Number;
        // user input using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Type any Number here: ");
         Number = sc.nextInt();
         
         // find even or odd
		
		if (Number %2== 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		sc.close();
		

	}

}
