package com.example.lasttask.controller;

import com.example.lasttask.dto.CarRequest;
import com.example.lasttask.dto.CarResponse;
import com.example.lasttask.dto.UpdateCarRequest;
import com.example.lasttask.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {
    @Autowired
    CarService carService;

    @PostMapping("/register")
    public ResponseEntity<CarResponse> registerCar(@RequestBody CarRequest request){
        return ResponseEntity.status(HttpStatus.FOUND).body(carService.addCar(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarResponse> findCarByID(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(carService.getCar(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id){
        return  ResponseEntity.status(HttpStatus.ACCEPTED).body(carService.deleteCar(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CarResponse> updateUser(@PathVariable Long id,
                                                  @RequestBody UpdateCarRequest request){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(carService.updateCar(id,request));
    }


}
