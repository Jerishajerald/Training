package com.example.demo.entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class TripDetail {
	
	
	int tripId;
	int driverId;
	LocalDate tripDate;
	int amount;
	
	

}
