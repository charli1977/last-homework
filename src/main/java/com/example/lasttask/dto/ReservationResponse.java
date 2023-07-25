package com.example.lasttask.dto;

import com.example.lasttask.entity.Car;
import com.example.lasttask.entity.User;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ReservationResponse {
    private Long id;
    private String dataBegin;
    private String dataEnd;
    private double price;
    private Car car;
    private User user;

}
