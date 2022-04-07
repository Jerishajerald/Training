package com.training.services;

class DiscountCalculator implements Conditional {

	@Override
	public boolean test(int Value) {
		// TODO Auto-generated method stub
		return Value>500;
	}

	@Override
	public boolean negate(int value) {
		// TODO Auto-generated method stub
		return value<500;
	}

}
