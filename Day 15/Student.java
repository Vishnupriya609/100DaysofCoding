package com.objects;
public class Student {

	public Student() {
		//variable
		int i = 50;  //constructor
	}

	public static void main(String[] args) {
		// creation of objects
		Student s1 = new Student(); // different addresses & hashcodes
		Student s2 = new Student();

		System.out.println(s1.hashCode()); //object identify number
		System.out.println(s2.hashCode()); //object identify number
	}

}
