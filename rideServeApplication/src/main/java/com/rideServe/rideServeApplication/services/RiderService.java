package com.rideServe.rideServeApplication.services;

import com.rideServe.rideServeApplication.dtos.DriverDto;
import com.rideServe.rideServeApplication.dtos.RideDto;
import com.rideServe.rideServeApplication.dtos.RideRequestDto;
import com.rideServe.rideServeApplication.dtos.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
