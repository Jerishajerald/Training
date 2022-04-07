package com.training.model;

import com.training.model.Insurance;
public class Application {
	public static void printPremium(Insurance object)
	{
		System.out.println(object.calculatePremium());
	}

	public static void main(String[] args) {
		
         
          VehicleInsurance car = new VehicleInsurance(123, "Jerisha", "car", 2019);
	      printPremium(car);
	      
	      LifeInsurance life=new LifeInsurance(1234,"MAHA",40);
	      printPremium(life);
	      String[] disease= {"bp","sugar","Thyroid"};
	      HealthInsurance health=new HealthInsurance(1234,"MAHA",disease);
	      printPremium(health);

	      
	      
	
	}
	}
