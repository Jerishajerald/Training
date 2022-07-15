package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TripDetail;
import com.example.demo.service.TripDetailService;

@RestController
@RequestMapping(path="api/v1/detail")
public class TripDetailController {
	
	@Autowired
	private TripDetailService service;
	
@PostMapping
public TripDetail save(@RequestBody TripDetail entity)
{
	return this.service.add(entity);
	
}
@GetMapping
public List<TripDetail> findAll()
{
	return this.service.findAll();
}
@GetMapping(path="{id}")
public List<TripDetail> findById(@PathVariable("id") int id)
{
	return this.service.findByDriverId(id);
}

	

}
