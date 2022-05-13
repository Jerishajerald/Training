package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
		DoctorUtils obj=ctx.getBean(DoctorUtils.class);
	    obj.create();
	    obj.findAll();
	    ctx.close();
	}
@Bean
public Doctor munna()
{
	Doctor doct=new Doctor();
	doct.setDoctorId(2);
	doct.setDoctorName("Munna");
	doct.setDepartment("ent");
	doct.setPhoneNumber(98765432);
	return doct;
	
}
@Bean
public Patient laksh()
{
	return new Patient(300,"lakshmi",98456732);
}
@Bean
public Patient maha()
{
	return new Patient(301,"maha",978986675);
}
@Bean
public Patient vedha()
{
	return new Patient(302,"Vedha",954866756);
}
}
