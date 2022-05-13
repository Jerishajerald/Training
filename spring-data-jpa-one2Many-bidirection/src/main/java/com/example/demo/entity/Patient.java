package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Jeri_patient_oneToMany_Bid")

@Data
@NoArgsConstructor

public class Patient {
	
		public Patient(int patientId, String patientName, long mobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
	}

		@Id//Referring primary key
		@Column(name="patient_id")
		int patientId;
		
		@Column(name="patient_name")
		String patientName;
		
		@Column(name="mobile_number")
		long mobileNumber;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="doctor_ref",referencedColumnName="doctor_id")
		private Doctor doctor;

		@Override
		public String toString() {
			return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", mobileNumber=" + mobileNumber
					+ "]";
		}
		

		
	}


