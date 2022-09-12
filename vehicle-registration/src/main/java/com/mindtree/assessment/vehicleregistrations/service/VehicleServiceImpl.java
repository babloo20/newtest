package com.mindtree.assessment.vehicleregistrations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.assessment.vehicleregistrations.entity.Vehicle;
import com.mindtree.assessment.vehicleregistrations.repository.VehicleRepo;

@Component
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepo vehicleRepository;
	
	@Override
	public List<Vehicle> getAllVehicles() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle createVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepository.save(vehicle);
	}

}
