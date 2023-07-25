package com.example.lasttask.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import java.time.Instant;


@Entity(name = "reservations")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Reservation {
    private long id;
    private Instant dateBegin;
    private Instant dateEnd;
    private double price;
    private int days;
    @ManyToOne
    @JsonBackReference
    private User user;
    @ManyToOne
    @JsonBackReference
    private Car car;


}
