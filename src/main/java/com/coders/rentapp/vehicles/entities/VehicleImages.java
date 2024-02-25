package com.coders.rentapp.vehicles.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VehicleImages {
    @Id
    @GeneratedValue
    private Integer id;
    @Lob
    private byte[] imageData;
}
