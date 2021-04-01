package com.example.improving.service.impl;

import com.example.improving.dto.ReservationDTO;
import com.example.improving.mapper.ReservationMapper;
import com.example.improving.model.Reservation;
import com.example.improving.repository.ReservationRepository;
import com.example.improving.service.ReservationService;
import java.util.ArrayList;
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
        .forEach(reservations::add);
    return reservations;
  }

  /**
   * Save reservation.
   *
   * @param reservation the reservation
   */
  @Override
  public void saveReservation(ReservationDTO reservation) {
    log.info("Saving reservation: " + reservation);
    reservationRepository
        .save(ReservationMapper.INSTANCE
            .reservationDTOToReservation(reservation));
  }

  /**
   * Removes the reservation.
   *
   * @param reservation the reservation
   */
  @Override
  public void removeReservation(ReservationDTO reservation) {
    log.info("Removing reservation: " + reservation);
    reservationRepository
        .delete(ReservationMapper.INSTANCE
            .reservationDTOToReservation(reservation));
  }
}
