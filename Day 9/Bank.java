package com.methods;

public class Bank {
	// class variable
	static int currentBalance = 2000;
		// Dashboard
		
		public static void greetCustomer() {
			System.out.println("Welcome to the banking application");
		}
		
		public void deposit(int amount) {
			currentBalance += amount;
			System.out.println("Amount deposited successfully");
			
		}
		public static void withdrawal(int amount) {
			currentBalance -= amount;
			System.out.println("Ampunt is withdrawal successfully");
		}
		
		public int getcurrentBalance() {
			return currentBalance;
			
		}
		
		public static void main(String[] args) {
			greetCustomer();
			System.out.println(Bank.currentBalance);
			Bank b = new Bank();
			b.deposit(300);
			System.out.println(b.getcurrentBalance());
			Bank.withdrawal(200);
			System.out.println(b.getcurrentBalance());
				
		}
}

