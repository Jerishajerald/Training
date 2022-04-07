package com.example.demo;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		
		String name=sc.next();
		System.out.println("Enter the farenTemp: ");
		double farentTemp=sc.nextDouble();
		
		System.out.println("Enter frm : ");
		int frm=sc.nextInt();
		
		System.out.println("Enter amt: ");
		double amt=sc.nextDouble();
		
		sc.close();
		
		Converter convObj= new Converter();
		System.out.println(convObj.convert(name));
		System.out.println("Celcius Temp: "+convObj.convert(farentTemp));
		System.out.println("amt is : "+convObj.convert(amt,frm));
		
		
		
		
		
		
		
		
		

	}

}
