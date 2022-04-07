package com.example;
import com.example.model.*;

public class Application {

	public static void main(String[] args) {
		
		Student ram=new Student();
		Student shyam= new Student(490,"shyam",89,"Mech");
		
		
		ram.setRollNumber(1234);//it is in public so can be accessible 
		
		//ram.setFirstName("Ram");//unable to access because it is in different package 
		//ram.setMarkScored(59);//not accessible because class is protected,in different package,not a sub class
		System.out.println(ram.getRollNumber());
		Student Magesh=new Student(988,"Subramani","textile");
		System.out.println("student name: "+Magesh.getMarkScored());
		System.out.println("Name : "+Magesh.getFirstName());
	
	}

}
