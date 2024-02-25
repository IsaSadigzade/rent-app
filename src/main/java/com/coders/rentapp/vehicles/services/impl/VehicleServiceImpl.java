package com.coders.rentapp.vehicles.services.impl;

import com.coders.rentapp.vehicles.repositories.VehicleRepository;
import com.coders.rentapp.vehicles.services.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;
}
