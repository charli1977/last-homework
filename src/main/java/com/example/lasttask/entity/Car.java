package com.example.lasttask.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity(name = "cars")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private String model;
    private int vin;
    private double price;
    @OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Reservation> reservation;
}
