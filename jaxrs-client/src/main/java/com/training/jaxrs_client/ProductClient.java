package com.training.jaxrs_client;

import com.example.entity.Product;
import com.training.ProductList;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
		Client client=ClientBuilder.newClient();
		
		WebTarget target=client.target("http://localhost:8080/products");
		Invocation.Builder builder=target.request(MediaType.APPLICATION_JSON) ;
	Response resp=builder.get();
//		Product object2=resp.readEntity(Product.class);
//		System.out.println(object2);
		
		//System.out.println(resp);
		//String object=resp.readEntity(String.class);
		//System.out.println(object);
		
		
//		Product toAdd=new Product(678,"Eraser",450);
//		Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
//        System.out.println(response.getStatus());
//        System.out.println(response.readEntity(String.class));
		
		int ch=3
				;
		
		
		if(ch==4) {
			Product[] list=resp.readEntity(Product[].class);
			for(Product eachProduct:list)
			{
				System.out.println(eachProduct);
			}
		}
		
		
		if(ch==1) {
			String  object=resp.readEntity(String.class);
	     System.out.println(object);

			
			
		}
		
		
		if(ch==2) {
		    WebTarget findByIdtarget=target.path("/srch/10");
				
		   Invocation.Builder builder2=findByIdtarget.request(MediaType.APPLICATION_JSON) ;
		  
			
			Response findByresp =builder2.get();
			Product object=resp.readEntity(Product.class);
			System.out.println(object);


			}
		
		
		if(ch==3) {
			Product toAdd=new Product(44, "sofa", 680);
			Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
			System.out.println(response.getStatus());
			System.out.println(response.readEntity(String.class));
			
		}
	}

}
