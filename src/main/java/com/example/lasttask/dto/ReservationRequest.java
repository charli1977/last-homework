package com.example.lasttask.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReservationRequest {
    @NotBlank
    private Instant dateBegin;
    @NotBlank
    private int days;
    @NotBlank
    private long userId;
    @NotBlank
    private long carId;
}
