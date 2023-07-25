package com.example.lasttask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateReservationRequest {
    private long carId;
    private Instant dateBegin;
    private int days;
}
