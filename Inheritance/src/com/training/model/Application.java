package com.training.model;

import com.training.services.BankAccountService;
import com.training.services.SavingAccountServices;

public class Application {

	public static void main(String[] args) {
		BankAccount ramsaccount=new BankAccount(1010,"Ramesh",50000,"saving");
		System.out.println(ramsaccount);
		SavingsAccount account=new SavingsAccount(340, "RAJESH", 60000, "joint","ramesh");
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		
		SavingAccountServices service=new SavingAccountServices();
		System.out.println(service.getCustomerInfo(account));
		System.out.println(service.calculateInterest(account));//substitution 
		
		BankAccountService service2=new SavingAccountServices();
		
		//cannot access the sub class method with super class reference
		//service2.getCustomerInfo();
		SavingAccountServices savingsService2=(SavingAccountServices)service2;
		System.out.println(savingsService2.getCustomerInfo(account));
		
		
		
	}

}
