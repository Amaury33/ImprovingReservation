package com.example.improving.service.impl;

import com.example.improving.model.Reservation;
import com.example.improving.repository.ReservationRepository;
import com.example.improving.service.ReservationService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class ReservationServiceImpl.
 */
@Service
@Slf4j
public class ReservationServiceImpl implements ReservationService {
  
  /** The reservation repository. */
  @Autowired
  ReservationRepository reservationRepository;

  /**
   * Gets the reservations.
   *
   * @return the reservations
   */
  @Override
  public List<Reservation> getReservations() {
    log.info("getReservations method reached.");
    final List<Reservation> reservations = new ArrayList<>();
    reservationRepository.findAll()
        .forEach(reservation -> reservations.add(reservation));
    return reservations;
  }

  /**
   * Save reservation.
   *
   * @param reservation the reservation
   */
  @Override
  public void saveReservation(Reservation reservation) {
    log.info("Saving reservation: " + reservation);
    reservationRepository.save(reservation);
  }

  /**
   * Removes the reservation.
   *
   * @param reservation the reservation
   */
  @Override
  public void removeReservation(Reservation reservation) {
    log.info("Removing reservation: " + reservation);
    reservationRepository.delete(reservation);
  }
}
