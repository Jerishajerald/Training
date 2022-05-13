package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name="jeri_ex_life_insu_2022")
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "policy_number")
public class LifeInsurance extends Insurance{
	
 public LifeInsurance(int policyNumber, String policyHolderName, int age, String profile) {
		super(policyNumber, policyHolderName);
		this.age = age;
		this.profile = profile;
	}
@Column(name="age")
private int age;
@Column(name="profile")
private String profile;
 
	
}
