package com.example.lasttask.service;

import com.example.lasttask.dto.ReservationRequest;
import com.example.lasttask.dto.ReservationResponse;
import com.example.lasttask.dto.UpdateReservationRequest;
import com.example.lasttask.entity.Reservation;

import java.time.Instant;
import java.util.List;
import java.util.Set;

public interface ReservationService {
    Reservation bookReservation(ReservationRequest request);
    ReservationResponse findReservationById(long id);
    void deleteReservation(long id);
    Set<Reservation> findReservationByPeriodWithNative(Instant start, Instant end);

    ReservationResponse updateReservation(long id, UpdateReservationRequest request);
    List<ReservationResponse> findByCar(long carId);
    List<ReservationResponse> findByUser(long userId);
}
