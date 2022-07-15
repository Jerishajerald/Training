package com.example.demo.dto;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TripDTO {

	private CabDriver driver;
	private Set<TripDetail> trips;
	//private List<TripDetail> trips;
}
