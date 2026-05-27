package com.operators;

public class logicalOperators {

	public static void main(String[] args) {
		// are used to combine 0r reverse boolean values
		int i = 15;
		int j = 20;
		System.out.println(i < 10 && j < 15); // false
		System.out.println(i > 10 || j < 10); // true
		System.out.println(!(i < 10)); // true

	}

}
