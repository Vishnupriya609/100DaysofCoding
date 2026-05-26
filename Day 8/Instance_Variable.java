package com.Variables;

public class Instance_Variable {
	
	// Define the instance variables
	int id;
	String name;

	public static void main(String[] args) {
		// create the object for non static variables
		Instance_Variable s1 = new Instance_Variable();
		s1.id = 101;
		s1.name = "Vishnu";
		System.out.println(s1.id);
		System.out.println(s1.name);
		

	}

}
