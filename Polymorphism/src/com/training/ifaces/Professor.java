package com.training.ifaces;

public class Professor implements Conditional {
	private String qualification;

	@Override
	public boolean test(Object Value) {
		String strvalue=(String)Value;
		boolean result=false;
		if(strvalue.toLowerCase().equals("chennai"))
		{
			result=true;
			
		}
		return result;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}

