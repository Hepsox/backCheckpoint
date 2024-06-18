package com.example.findfreelance.domains.booking;

import com.example.findfreelance.domains.entreprise.Entreprise;
import com.example.findfreelance.domains.freelance.Freelance;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Date dateDebut;

    private String debutCondition;

    private int numberDays;


    @ManyToOne
    @JsonIgnoreProperties("bookings")

    private Entreprise entreprise;

    @ManyToOne
    @JsonIgnoreProperties("bookings")
    private Freelance freelance;
}
