package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="jeri_Trip_Details")
public class TripDetail {
	
	@Id
	@Column(name="trip_id")
	int tripId;
	
	@Column(name="driver_id")
	int driverId;
	
	@Column(name="trip_date")
	LocalDate tripDate;
	
	@Column(name="amount")
	int amount;
	
	

}
