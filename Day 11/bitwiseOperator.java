package com.operators;

public class bitwiseOperator {

	public static void main(String[] args) {
		//  work on the binary (0 and 1)
		int a = 12;
		int b = 24;
		int c = 120;
		System.out.println(a & b); //8
		System.out.println(a | b); //28
		System.out.println(a ^ b); //20
		System.out.println(a<<2); //48
		System.out.println(a >>2);  //3
		System.out.println(c>>>2); //30

	}

}
