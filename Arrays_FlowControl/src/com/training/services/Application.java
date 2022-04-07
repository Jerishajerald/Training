package com.training.services;
import com.training.model.BankAccount;

public class Application {

	public static void main(String[] args) {
		BankAccountService service=new BankAccountService();
		BankAccount ram=new BankAccount(5000,"Rajesh",5000);
		BankAccount sham=new BankAccount(6200,"Ramesh",5000);
		double simpleInterest=service.calculateInterest(ram);
		System.out.println("Simple Interest @%6="+simpleInterest);
		double simpleInterest1=service.calculateInterest(sham);
		System.out.println("Simple Interest @5%= "+simpleInterest1);
		
//		BankAccount[] accounts=new BankAccount[2];
//		accounts[0]=ram;
//		accounts[1]=sham;
	    BankAccount[] accounts={ram,sham};
		service.calculateInterest(accounts);
		
		
		System.out.println("------------------------");
		double[] values=service.findInterest(accounts);
		for(double eachValue: values)
		{
			System.out.println(eachValue);
		}
		System.out.println("-------------ARRAY-----------------");
		BankAccount[] accountList= {
				
				new BankAccount(800,"Jay",5000,"saving"),
				new BankAccount(800,"Kam",3000,"fixed"),
				new BankAccount(800,"Tom",8000,"recurring")};
		double[] interestValues=service.findInterestByAccountType(accountList);
		
		for(double eachValue: interestValues)
		{
			System.out.println(eachValue);
		}

	}

}
