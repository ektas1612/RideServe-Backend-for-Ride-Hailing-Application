package com.rideServe.rideServeApplication.repositories;

import com.rideServe.rideServeApplication.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
