package com.training.services;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;

public class Application {

	public static void main(String[] args) {
		Function conv=new CurrencyConverter();
//		CurrencyConverter conv= new CurrencyConverter();
		double response=conv.apply(200);
		System.out.println(response);
		
		System.out.println(Function.COUNTER);
		if(conv instanceof CheckCondition)
		{
			CheckCondition obj=(CheckCondition)conv;
			System.out.println("IS DISCOUNT ALLOWED:="+obj.test(300));

		}
		
		Conditional condobj=new DiscountCalculator();
		System.out.println(condobj.test(6000));
		System.out.println(condobj.test(6000));
		
	}

}
