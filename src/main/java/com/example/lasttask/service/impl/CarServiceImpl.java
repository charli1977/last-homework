package com.example.lasttask.service.impl;

import com.example.lasttask.converter.CarConverter;
import com.example.lasttask.dto.CarRequest;
import com.example.lasttask.dto.CarResponse;
import com.example.lasttask.dto.UpdateCarRequest;
import com.example.lasttask.entity.Car;
import com.example.lasttask.repository.CarRepository;
import com.example.lasttask.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final CarConverter carConverter;

    @Autowired
    public CarServiceImpl(CarRepository carRepository, CarConverter carConverter) {
        this.carRepository = carRepository;
        this.carConverter = carConverter;
    }

    @Override
    public CarResponse addCar(CarRequest request){
        Car car = carConverter.toCar(request);
        return carConverter.toResponse(carRepository.save(car));
    }
    @Override
    public CarResponse getCar(Long id){
        return carConverter.toResponse(carRepository.findById(id).get());
    }

    @Override
    public String deleteCar(Long id) {
        carRepository.deleteById(id);
        return "Deleted car with id " + id;
    }
    @Override
    public CarResponse updateCar(Long id, UpdateCarRequest request){
        Car car = carRepository.findById(id).get();
        if (request.getPrice() > 0) {
            car.setPrice(request.getPrice());
        }
        return carConverter.toResponse(carRepository.save(car));
    }
}
