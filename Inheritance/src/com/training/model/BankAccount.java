package com.training.model;

public class BankAccount {
	
	@Override
	public  String toString() {
		// TODO Auto-generated method stub
		return super.toString() +accountNumber+"'"+this.accountHolderName+"'"+this.balance+"'"+this.accountType;
	}
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	private String accountType;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Zero args constructor of super class called");
		
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super();
		System.out.println("Four args constructor of super class called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountName) {
		this.accountNumber = accountName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		
		System.out.println("Three args constructor of super class called");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	

}
