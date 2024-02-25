package com.coders.rentapp.vehicles.repositories;

import com.coders.rentapp.vehicles.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
