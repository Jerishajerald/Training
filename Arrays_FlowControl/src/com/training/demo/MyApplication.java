package com.training.demo;

import com.training.services.BankAccountService;
import com.training.model.BankAccount;
import java.util.*;


public class MyApplication {

	public static void main(String[] args) {
		BankAccountService service=new BankAccountService();
		BankAccount[] list=new BankAccount[2];
		
		Scanner sc=new  Scanner(System.in);
		int i=0;
		int choice=0;
		
		
		   
		do {
			
			
			
			System.out.println("Account Number: ");
			int accountNumber=sc.nextInt();
			System.out.println("Account Holder Name: ");
			String accountHolderName =sc.next();
			System.out.println("Account Balance: ");
			double balance=sc.nextDouble();
			System.out.println("Account Type : ");
			String accountType=sc.next();
			
			
		
			
			BankAccount Account=new BankAccount(accountNumber, accountHolderName, balance, accountType);
		
			list[i]=Account;
			i++;
			System.out.println("enter 0 or 1: ");
			choice=sc.nextInt();
			
			
		  
		   
		
		
		}
		while(choice==1);
		
			double[] values =service.findInterestByAccountType(list);
		
			
			
			
			
	for(double eachValue:values)
	{
		
		System.out.println("The balance is "+eachValue);
	
		}
		sc.close();
		}
	
			
			
		
	}
	

