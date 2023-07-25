package com.example.lasttask.converter;

import com.example.lasttask.dto.ReservationRequest;
import com.example.lasttask.dto.ReservationResponse;
import com.example.lasttask.entity.Car;
import com.example.lasttask.entity.Reservation;
import com.example.lasttask.entity.User;
import com.example.lasttask.repository.CarRepository;
import com.example.lasttask.repository.UserRepository;
import com.example.lasttask.utl.DateFormatterUtil;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Component
public class ReservationConverter {
    private final UserRepository userRepository;
    private final CarRepository carRepository;

    public ReservationConverter(UserRepository userRepository, CarRepository carRepository) {
        this.userRepository = userRepository;
        this.carRepository = carRepository;
    }
    public Reservation toReservation(ReservationRequest request){
        User user = userRepository.findById(request.getUserId()).get();
        Car car = carRepository.findById(request.getCarId()).get();
        return Reservation.builder()
                .car(car)
                .user(user)
                .days(request.getDays())
                .dateBegin(request.getDateBegin())
                .price(car.getPrice()*request.getDays())
                .dateEnd(getDateEnd(request.getDays(), request.getDateBegin()))
                .build();
    }
    public ReservationResponse toReservationResponse(Reservation reservation) {
        return ReservationResponse.builder()
                .user(reservation.getUser())
                .car(reservation.getCar())
                .price(reservation.getPrice())
                .id(reservation.getId())
                .dataBegin(DateFormatterUtil.getDateFromDateTime(reservation.getDateBegin()).toString())
                .dataEnd(DateFormatterUtil.getDateFromDateTime(reservation.getDateEnd()).toString())
                .build();
    }
    public Instant getDateEnd(int days, Instant dateBegin) {
        return dateBegin.plusMillis
                (TimeUnit.MILLISECONDS.convert(days, TimeUnit.DAYS));
    }
}
