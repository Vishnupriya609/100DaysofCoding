package com.constructors;

public class typesOfExplicit {
	//example for types of explicit
	// define variable
	int i;
	//parameter less constructor
	
	public typesOfExplicit() {  
		i = 50;
		System.out.println("No-arg constructor: " +i);
	}
	//parameterized constructor
	public typesOfExplicit(int i) { 
		this.i = i; // this keyword is used beacuse not confused 
		System.out.println("Parameterized constructor: " +this.i);
	}

	public static void main(String[] args) {
		typesOfExplicit tc = new typesOfExplicit(); //No-arg constructor
		typesOfExplicit tc1 = new typesOfExplicit(100); //parameterized constructor
			

	}

}
