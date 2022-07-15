package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class DriverServiceClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DriverServiceClientApplication.class, args);
	     Client client=ctx.getBean(Client.class);
	     System.out.println(client.invokeGetAll());
	     //Driver[] list=client.invokeAllAsObject();
//	     client.add();
	  
//	     for(Driver eachDriver:list)
//	     {
//	    	 System.out.println("Driver id is: "+eachDriver.getDriverId());
//	    	 System.out.println("Driver Name is: "+eachDriver.getDriverName());
//	    	 System.out.println("Mobile Number is: "+eachDriver.getMobileNumber());
//	    	 System.out.println("Driver Rating is: "+eachDriver.getRating());
//	     }
//	     
	     ctx.close();
	}
@Bean
public RestTemplate template()
{
	RestTemplate template=new RestTemplate();
	template.getInterceptors().add(interceptor());
	return template;
}

@Bean
public BasicAuthenticationInterceptor interceptor() {
	return new BasicAuthenticationInterceptor("nepal","nepal");
	
}
}
