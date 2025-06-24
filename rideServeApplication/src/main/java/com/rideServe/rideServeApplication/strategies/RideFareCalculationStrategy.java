package com.rideServe.rideServeApplication.strategies;

import com.rideServe.rideServeApplication.dtos.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
