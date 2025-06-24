package com.rideServe.rideServeApplication.dtos;

import com.rideServe.rideServeApplication.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private Long id;

    private UserDto user;

    private Double rating;

    private Boolean available;

    private String vehicleId;
}
