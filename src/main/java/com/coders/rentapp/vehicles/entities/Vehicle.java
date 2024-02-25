package com.coders.rentapp.vehicles.entities;

import com.coders.rentapp.vehicles.enums.FeatureType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String city;
    private String country;
    private BigDecimal price;
    private Boolean rentalStatus;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<FeatureType> features;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime creationTime;
    @UpdateTimestamp
    private LocalDateTime updateTime;
    @Lob
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private VehicleImages vehicleImages;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private VehicleDetails vehicleDetails;
}
