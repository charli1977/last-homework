package com.example.lasttask.converter;

import com.example.lasttask.dto.CarRequest;
import com.example.lasttask.dto.CarResponse;
import com.example.lasttask.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarConverter {
    public Car toCar(CarRequest request){
        return Car.builder()
                .brand(request.getBrand())
                .model(request.getModel())
                .vin(request.getVin())
                .price(request.getPrice())
                .build();
    }

    public CarResponse toResponse(Car car){
        return CarResponse.builder()
                .brand(car.getBrand())
                .model(car.getModel())
                .vin(car.getVin())
                .price(car.getPrice())
                .build();
    }
}
