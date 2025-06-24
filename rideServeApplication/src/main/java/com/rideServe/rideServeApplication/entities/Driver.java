package com.rideServe.rideServeApplication.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.apache.bcel.classfile.Code;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double rating;

    private Boolean available;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    Point currentLocation;
}
