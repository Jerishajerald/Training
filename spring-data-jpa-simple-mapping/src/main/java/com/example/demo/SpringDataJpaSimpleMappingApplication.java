package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
		//Doctor siva=ctx.getBean(Doctor.class);
	   DoctorService service=ctx.getBean(DoctorService.class);
	   
	   System.out.println("****************FindAll***********");
	   service.findAll().forEach(System.out::println);
	   
	   System.out.println("*****************find by doctor name******************");
	  System.out.println(service.findByDoctorNames("maha"));
	   
	   System.out.println("******************find by name and depart************");
	   service.findByDoctorNameAndDepartment("Jebra","ortho").forEach(System.out::println);
	   
	   
	
	   System.out.println("***************findBy***************");
	   service.getByNameDept("janu", "cardio").forEach(System.out::println);
//	Doctor added=service.add(siva);
	   
	   
	   System.out.println("********************fibd by department**************");
	service.findByDepartment("ortho").forEach(System.out::println);
//	if(added!=null)
//	{
//		System.out.println("one record added");
//	}
		ctx.close();
		
	}
	@Bean
	public Doctor siva()
	{
		return new Doctor(129,"Meena","veternary",87654905);
		
	}

}
