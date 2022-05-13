package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOne2ManyBidirectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOne2ManyBidirectionApplication.class, args);
		DoctorUtils obj=ctx.getBean(DoctorUtils.class);
	    obj.create();
	    obj.findAll();
	    obj.findDoctorFrmPatient();
	}
	@Bean
	public Doctor munna()
	{
		Doctor doct=new Doctor();
		doct.setDoctorId(2000);
		doct.setDoctorName("Munna");
		doct.setDepartment("cardio");
		doct.setPhoneNumber(98765432);
		return doct;
		
	}
	@Bean
	public Patient murali()
	{
		return new Patient(202,"Murali",98456732);
	}
	@Bean
	public Patient venkat()
	{
		return new Patient(203,"Venkat",978986675);
	}
	@Bean
	public Patient vedha()
	{
		return new Patient(204,"Vedha",954866756);
	}
}
