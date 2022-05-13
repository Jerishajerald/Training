package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.services.InsuranceService;

@SpringBootApplication
public class SingleTablePerSubClassApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SingleTablePerSubClassApplication.class, args);
	    InsuranceService service=ctx.getBean(InsuranceService.class);
	   // service.addHealthPolicy();
	    //service.addLifePolicy();
	service.getHealthPolicy();
	System.out.println("***************");
	service.getLifePolicy();
	}
	@Bean
	public LifeInsurance life()
	{
		return new LifeInsurance(101, "Maha", 62, "It services");
	}
	
	
    @Bean
    public HealthInsurance health()
    {
    	return new HealthInsurance(202, "Venkat", 76, "Cancer");
    }
    
}