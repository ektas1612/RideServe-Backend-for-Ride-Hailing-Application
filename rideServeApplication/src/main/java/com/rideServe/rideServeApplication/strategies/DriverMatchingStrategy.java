package com.rideServe.rideServeApplication.strategies;

import com.rideServe.rideServeApplication.dtos.RideRequestDto;
import com.rideServe.rideServeApplication.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
