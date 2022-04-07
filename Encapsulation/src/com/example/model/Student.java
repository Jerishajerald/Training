package com.example.model;

public class Student {
	private int rollNumber;
	private String firstName;
	private double markScored;
	private String batch;
	public int getRollNumber() {
		return rollNumber;
	}
	 public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	 public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public Student() {
		super();
		
		
		
	}
	public Student(int rollNumber, String firstName, double markScored, String batch) {
		super();
		//this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
		this.batch = batch;
	}
	
	public Student(int rollNumber, String firstName, String batch) {
		this(rollNumber,firstName,99,batch);
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.batch = batch;
	}
	
	


}
