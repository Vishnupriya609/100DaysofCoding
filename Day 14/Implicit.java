package com.constructors;

public class Implicit {
	//example for implicit
	int i;
	
	void display() {  // method
		i = 30;
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		Implicit ic = new Implicit(); //implicit constructor called automatically
		ic.display();
		
	}

}
