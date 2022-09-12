package com.mindtree.assessment.vehicleregistrations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.mindtree.assessment.vehicleregistrations.service.VehicleService;
import com.mindtree.assessment.vehicleregistrations.entity.Vehicle;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/vehiclelist")
	public List<Vehicle> getAllVehicles() {
		return vehicleService.getAllVehicles();
		
	}
	
	@PostMapping("/vehiclelist")
	public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.createVehicle(vehicle);
		
	}	
}
