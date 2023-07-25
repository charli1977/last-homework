package com.example.lasttask.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CarResponse {
    private String brand;
    private String model;
    private int vin;
    private double price;

}
