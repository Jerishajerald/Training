package com.training.utils;

import com.training.ifaces.Conditional;
import com.training.ifaces.Professor;
import com.training.ifaces.Student;

public class ObjectFactory {
	
	public Conditional getConditional(int key)
	{
		switch (key) {
		case 1:
			return new Professor("chennai");
			
		case 2:
			return new Student(89);
           
		default:
			return null;
		}
	}
	public double getValue(Conditional obj,Object Value)
	{
		//HERE obj reference type 
		boolean result =obj.test(Value);
		double travelAllowance=1000;
		if(result)
		{
			travelAllowance=2000;
		}
		return travelAllowance;
	}

}
