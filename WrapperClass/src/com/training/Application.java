package com.training;

public class Application {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		int value=Integer.parseInt (args[0]);
//		System.out.println(++value);
		CurrencyConverter conv=new CurrencyConverter();
		
		double dblamount=Double.parseDouble(args[0]);
		System.out.println(conv.inrToUsd(dblamount));
		
		Double inrValue=Double.parseDouble(args[1]);//
		System.out.println(conv.inrToEuro(inrValue));
		
		double salary=4327.00;
		int  intsal =(int)salary;
		System.out.println(intsal);
		
		
		int age=42;
		String strAge=Integer.toString(age);//converting to string to primitive int
		int intage=Integer.valueOf(strAge);//converting string to int
		System.out.println(intage);
		
		
		
		
		
		
	}

}
