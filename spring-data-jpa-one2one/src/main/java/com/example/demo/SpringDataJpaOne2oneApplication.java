package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;

@SpringBootApplication
public class SpringDataJpaOne2oneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOne2oneApplication.class, args);
		//Seminar obj=ctx.getBean(Seminar.class);
		SeminarRepository repo=ctx.getBean(SeminarRepository.class);
//		Seminar added=repo.save(obj);
//		if(added!=null)
//		{
//			System.out.println("One record added");
//		}
	List<Seminar> semi=repo.findAll();
	System.out.println(semi);
		
	}
	
@Bean 
public Seminar java()
{  
	return new Seminar(1, "Java", 20, janu());
	
}
@Bean
public Speaker janu()
{  
	return new Speaker(1203, "Janu", "M.Tech" );
	
}
}
