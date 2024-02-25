package com.coders.rentapp.vehicles.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String emailAddress;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_details_id", referencedColumnName = "id")
    @JoinColumn
    private UserDetails userDetails;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_image_id", referencedColumnName = "id")
    @JoinColumn
    private UserImage userImage;
}
