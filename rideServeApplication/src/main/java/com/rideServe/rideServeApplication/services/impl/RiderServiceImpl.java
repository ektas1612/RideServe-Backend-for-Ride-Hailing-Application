package com.rideServe.rideServeApplication.services.impl;

import com.rideServe.rideServeApplication.dtos.DriverDto;
import com.rideServe.rideServeApplication.dtos.RideDto;
import com.rideServe.rideServeApplication.dtos.RideRequestDto;
import com.rideServe.rideServeApplication.dtos.RiderDto;
import com.rideServe.rideServeApplication.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
