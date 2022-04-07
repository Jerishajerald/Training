package com.training;

public class Application {

	public static void main(String[] args) {
		
		Greeting grtObj = new Greeting();
		//System s=new System(); constructor of the system is private so we cannot create this
		System.out.println(grtObj.getInfo());
		System.out.println(Greeting.getInfo());
		
	}

}

