package com.coders.rentapp.vehicles.repositories;

import com.coders.rentapp.vehicles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
