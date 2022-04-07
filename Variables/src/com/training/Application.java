package com.training;

public class Application {

	public static void main(String[] args) {
		BankAccount account1=new BankAccount("Ramesh",10000);
		BankAccount account2=new BankAccount("Maha",2000);
		System.out.println(account1.getAccountHolderName());
		
		System.out.println(account1.getUpdatedBalance(2000));
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getUpdatedBalance(2000));
		System.out.println(account2.getAccountHolderName());
		System.out.println(account2.getUpdatedBalance(4000));
		System.out.println(account2.getAccountNumber());
		
		
		
		
		
		

	}

}
