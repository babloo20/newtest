package com.mindtree.assessment.vehicleregistrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.delivery.service","com.delivery.request"})
public class VehicleRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRegistrationApplication.class, args);
	}

}
