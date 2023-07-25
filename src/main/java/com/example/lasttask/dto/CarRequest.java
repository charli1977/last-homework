package com.example.lasttask.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.Length;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CarRequest {
    @NotBlank
    @Length(min = 2 , message = "Brand must be at least 2 characters")
    private String brand;
    @NotBlank
    @Length(min = 2, message = "Model must be at least 2 characters")
    private String model;
    @NotBlank
    private int vin;
    @NotBlank
    private double price;

}
