package com.example.lasttask.service;

import com.example.lasttask.dto.CarRequest;
import com.example.lasttask.dto.CarResponse;
import com.example.lasttask.dto.UpdateCarRequest;

public interface CarService {

    CarResponse addCar(CarRequest request);

    CarResponse getCar(Long id);

    String deleteCar(Long id);

    CarResponse updateCar(Long id, UpdateCarRequest request);


}
