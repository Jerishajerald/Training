package com.training.services;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;

//A class can implement

public class CurrencyConverter implements Function,CheckCondition{

	@Override
	public double apply(double value) {
		// TODO Auto-generated method stub
		return value*100;
	}

	@Override
	public boolean test(int Value) {
		// TODO Auto-generated method stub
		return Value>5000;
	}

}
