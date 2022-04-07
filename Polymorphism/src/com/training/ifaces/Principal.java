package com.training.ifaces;

public class Principal implements Conditional {
	private String typeOfCollege;

	@Override
	public boolean test(Object Value) {
		String strclg=(String)Value;
		boolean result=false;
		if(strclg.toLowerCase().equals("s.a"))
		{
			result=true;
			
		}
		return result;
	
	}

	public Principal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Principal(String typeOfCollege) {
		super();
		this.typeOfCollege = typeOfCollege;
	}

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}
	

}
