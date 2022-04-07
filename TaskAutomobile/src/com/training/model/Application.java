package com.training.model;

import com.training.ifaces.AutoMobile;

public class Application {

	public static void main(String[] args) {
		ObjectFactory factory=new ObjectFactory();
		AutoMobile toyo=  factory.getObject(1);
		AutoMobile maru=  factory.getObject(2);
		factory.printQuote(toyo);
		factory.printQuote(maru);
		
		
	
	}

}
