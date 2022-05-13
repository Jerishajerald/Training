package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
	private EmployeeRepository repo;
    @Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	public Employee add(Employee entity)
	{
		return this.repo.save(entity);
		
	}
   
	public List<Employee> findAll(){
		
		return this.repo.findAll();
	}
	
	
   public List<Employee> findByDateOfBirth(LocalDate srch)
   {
	return this.repo.findByDateOfBirth(srch);
	   
   }
   public List<Employee> findByLocationAndSkillSet(String location,String skillset)
   {
	   return this.repo.findByLocationAndSkillSet(location, skillset);
   }
   public List<Employee> findByLocation(String srch)
   {
	   return this.repo.findByLocation(srch);
   }
   public List<Employee> findBySkillSet(String srch)
   {
	   return this.repo.findBySkillSet(srch);
   }
   public List<Employee> getBySkillsetLocation(String locname,String skill)
   {
	   return this.repo.getBySkillsetLocation(locname, skill);
  }


}
