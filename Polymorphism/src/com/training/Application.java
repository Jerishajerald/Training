package com.training;

import com.training.ifaces.Conditional;
import com.training.model.NewObjectFactory;
import com.training.utils.ObjectFactory;

public class Application {

	public static void main(String[] args) {
		ObjectFactory factory=new NewObjectFactory();
		
	
	Conditional profObj=  factory.getConditional(1);
	Conditional studObj=  factory.getConditional(2);
	Conditional princiObj=  factory.getConditional(3);
	
	
	System.out.println("Allowance:="+factory.getValue(profObj, "Chennai"));
	System.out.println("Allowance:="+factory.getValue(studObj, "89"));
	System.out.println("Allowance:="+factory.getValue(princiObj, "s.a"));
	}

}