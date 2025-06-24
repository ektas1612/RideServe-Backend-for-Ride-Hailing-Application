package com.rideServe.rideServeApplication.services;

import com.rideServe.rideServeApplication.dtos.DriverDto;
import com.rideServe.rideServeApplication.dtos.SignupDto;
import com.rideServe.rideServeApplication.dtos.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
