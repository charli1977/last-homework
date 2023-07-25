package com.example.lasttask.service.impl;

import com.example.lasttask.converter.ReservationConverter;
import com.example.lasttask.dto.ReservationRequest;
import com.example.lasttask.dto.ReservationResponse;
import com.example.lasttask.dto.UpdateReservationRequest;
import com.example.lasttask.entity.Reservation;
import com.example.lasttask.repository.CarRepository;
import com.example.lasttask.repository.ReservationRepository;
import com.example.lasttask.service.ReservationService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Set;
@Service
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;
    private final ReservationConverter reservationConverter;
    private final CarRepository carRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository, ReservationConverter reservationConverter, CarRepository carRepository) {
        this.reservationRepository = reservationRepository;
        this.reservationConverter = reservationConverter;
        this.carRepository = carRepository;
    }


    @Override
    public Reservation bookReservation(ReservationRequest request) {
        return null;
    }

    @Override
    public ReservationResponse findReservationById(long id) {
        return null;
    }

    @Override
    public void deleteReservation(long id) {

    }

    @Override
    public Set<Reservation> findReservationByPeriodWithNative(Instant start, Instant end) {
        return null;
    }

    @Override
    public ReservationResponse updateReservation(long id, UpdateReservationRequest request) {
        return null;
    }

    @Override
    public List<ReservationResponse> findByCar(long carId) {
        return null;
    }

    @Override
    public List<ReservationResponse> findByUser(long userId) {
        return null;
    }
}
