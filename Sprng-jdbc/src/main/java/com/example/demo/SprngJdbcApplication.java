package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootApplication
public class SprngJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SprngJdbcApplication.class, args);
		ProductRepository repo=ctx.getBean(ProductRepository.class);
	    repo.findAll().forEach(System.out::println);

	    Product tv = ctx.getBean(Product.class);
//	    
	    System.out.println(tv);
	   // System.out.println("****One Row Added**** ");
	    System.out.println(repo.findById(10));
	  
//	    System.out.println("deleted "+repo.remove(104));
	    System.out.println("Updated row :"+repo.update(tv));
	    
	}
@Bean
public Product tv() {
	
	return new Product(122,"samsungTV",20001);

}

}
