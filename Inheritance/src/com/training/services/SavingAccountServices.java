package com.training.services;
import com.training.model.BankAccount;
import com.training.model.SavingsAccount;
import com.training.services.BankAccountService;

public class SavingAccountServices extends BankAccountService {

	public String getCustomerInfo(SavingsAccount account) {
		
		return account.getAccountHolderName();
		
	}

	@Override
	public double calculateInterest(BankAccount account) {
		// TODO Auto-generated method stub{
		double simpleInterest=0.10;
		if(account.getAccountNumber()<=5000)
		{
			simpleInterest=0.20;
		}
		return account.getBalance()*1*simpleInterest;
	}
		
	}

