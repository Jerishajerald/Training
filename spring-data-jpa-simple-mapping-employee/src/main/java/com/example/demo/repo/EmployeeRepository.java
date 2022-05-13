package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public List<Employee> findByDateOfBirth(LocalDate srch);
	public List<Employee> findByLocation(String srch);
	public List<Employee> findBySkillSet(String srch);
	
     public List<Employee> findByLocationAndSkillSet(String location,String skillset);
     
     @Query(nativeQuery=true,value="select * from Jerisha_employee where location=:locname or skillset=:skill")
    	public List<Employee> getBySkillsetLocation(@Param("locname") String locname,@Param("skill") String skill);

     
}
