package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Seminar;
import com.example.demo.ifaces.SeminarRepository;

public class SeminarUtils {
  @Autowired
  Seminar sem;
  
  @Autowired
  SeminarRepository repo;
  
  public void create()
	{
		
		Seminar added=repo.save(sem);
		if(added!=null)
		{
			System.out.println("One record added");
		}
	}
}
