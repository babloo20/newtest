package com.mindtree.assessment.vehicleregistrations.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.assessment.vehicleregistrations.entity.Vehicle;

@Service
public interface VehicleService {
	
	List<Vehicle> getAllVehicles();
	Vehicle createVehicle(Vehicle vehicle);

}
