package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="jeri_ex_health_2022")
public class HealthInsurance extends Insurance{
 private int age;
 private String status;
public HealthInsurance(int policyNumber, String policyHolderName, int age, String status) {
	super(policyNumber, policyHolderName);
	this.age = age;
	this.status = status;
}
 
}
