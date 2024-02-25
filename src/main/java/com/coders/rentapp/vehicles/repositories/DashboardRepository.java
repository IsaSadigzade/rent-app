package com.coders.rentapp.vehicles.repositories;

import com.coders.rentapp.vehicles.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepository extends JpaRepository<Vehicle, Integer> {
}
