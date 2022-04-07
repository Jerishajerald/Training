package com.training.services;

import com.training.ifaces.CheckCondition;

public interface Conditional extends CheckCondition

//one interface can extend other interface
{
	public boolean negate(int value);
	
	
	
	

}
