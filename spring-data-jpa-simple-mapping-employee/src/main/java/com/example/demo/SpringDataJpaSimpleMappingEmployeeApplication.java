package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingEmployeeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaSimpleMappingEmployeeApplication.class, args);
//		Employee jeri=ctx.getBean(Employee.class);
		EmployeeService service=ctx.getBean(EmployeeService.class);
		
		
	//	service.findAll().forEach(System.out::println);
		
		
		
	System.out.println("****************date*******************");
		service.findByDateOfBirth(LocalDate.of(2001, 7, 7)).forEach(System.out::println);
		
		
	//System.out.println("******************************");
	//service.findByLocationAndSkillSet("Chennai","Java").forEach(System.out::println);
		
		
	//service.findByLocation("Chennai").forEach(System.out::println);
		
		
	//service.findBySkillSet("Java").forEach(System.out::println);
		
		
		
		service.getBySkillsetLocation("Chennai", "Sql").forEach(System.out::println);
		
		
//		Employee added=service.add(jeri);
//		if(added !=null)
//		{
//			System.out.println("one row added");
//		}
		
		ctx.close();
		
		
	}
	@Bean
	public Employee jeri()
	{
		return new Employee(124,"Meena",LocalDate.of(2001, 7, 7),"Chennai","Sql",789654369);
		
	}

}
