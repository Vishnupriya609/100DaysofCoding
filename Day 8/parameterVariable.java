package com.Variables;

public class parameterVariable {
	// we can define but not intialization we can call the function in main method 

			void show(int x) {   // x is a parameter
		        System.out.println(x);
		    }

		    public static void main(String[] args) {
		        parameterVariable d = new parameterVariable();
		        d.show(10);   // 10 is argument
		    }
	}



