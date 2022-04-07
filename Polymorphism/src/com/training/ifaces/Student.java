package com.training.ifaces;

public class Student implements Conditional {
	private int markScored;

	public int getMarkScored() {
		return markScored;
	}

	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}

	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object Value) {
		String strBranch=(String)Value;
		boolean result=false;
		if(this.markScored>80 && strBranch.equalsIgnoreCase("ece"))
		{
			return true;
			
		}
		
		return result;
	}

}
