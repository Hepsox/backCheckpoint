package com.example.findfreelance.domains.freelance;

import com.example.findfreelance.domains.booking.Booking;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Freelance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;

    private int price;

    private String description;

    private String skills;

    private String photo;

    @OneToMany(mappedBy = "freelance")
    @JsonIgnoreProperties("freelance")
    private List<Booking> bookings;


}
