package com.training.model;

import com.training.ifaces.AutoMobile;
import com.training.ifaces.MaruthiCar;
import com.training.ifaces.ToyotaCar;

public class ObjectFactory {
	
	public AutoMobile getObject(int key)
	{
		switch (key) {
		case 1:
			return new MaruthiCar();
			
		case 2:
			return new ToyotaCar();
           
		default:
			return null;
		}
	}
	
public void printQuote(AutoMobile poly)
{
	System.out.println(poly.getColor());
	System.out.println(poly.getModel()); 
	System.out.println(poly.getPrice());
}




}
