package com.rideServe.rideServeApplication.dtos;

import com.rideServe.rideServeApplication.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiderDto {
    private Long id;

    private UserDto user;

    private Double rating;
}
