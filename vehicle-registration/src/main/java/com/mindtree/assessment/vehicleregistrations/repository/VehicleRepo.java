package com.mindtree.assessment.vehicleregistrations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.assessment.vehicleregistrations.entity.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

}
