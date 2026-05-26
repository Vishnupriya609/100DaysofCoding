package com.Variables;

public class localVariable {
	
	void display () {
		// local variables inside the method
		System.out.println(23);
	}
	
	localVariable() {
		// constructor
		System.out.println("Vishnu");
	}

	public static void main(String[] args) {
		// you can't access the value in another method
		// Constructor runs automatically when class name = constructor name
		// here to create object
		localVariable s2 = new localVariable();
		s2.display();
		

	}

}
