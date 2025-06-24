package com.rideServe.rideServeApplication.services;


import com.rideServe.rideServeApplication.dtos.RideRequestDto;
import com.rideServe.rideServeApplication.entities.Driver;
import com.rideServe.rideServeApplication.entities.Ride;
import com.rideServe.rideServeApplication.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);



}
