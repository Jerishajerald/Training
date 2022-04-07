package com.training.model;

public class SavingsAccount extends BankAccount {

	private String nominee;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String nominee) {
		super();
		this.nominee = nominee;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}
	
	// whenever sub class constructor is called super class also called ,even super ()is not present
//Zero arg Constructor
	
	//	public SavingsAccount() {
   //		System.out.println("Constructor of Sub class");
  //	}
	
	
	//Three args constructor is called
//	public SavingsAccount() {
//		super(1010,"Ramesh",50000);
//	System.out.println("Constructor of Sub class");
	
	
	//}
	
	
}
