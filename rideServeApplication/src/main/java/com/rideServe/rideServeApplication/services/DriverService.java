package com.rideServe.rideServeApplication.services;

import com.rideServe.rideServeApplication.dtos.DriverDto;
import com.rideServe.rideServeApplication.dtos.RideDto;
import com.rideServe.rideServeApplication.dtos.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
