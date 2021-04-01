package com.example.improving.service;

import com.example.improving.dto.ReservationDTO;
import com.example.improving.model.Reservation;
import java.util.List;

/**
 * The Interface ReservationService.
 */
public interface ReservationService {

  /**
   * Gets the reservations.
   *
   * @return the reservations
   */
  public List<Reservation> getReservations();
  
  /**
   * Save reservation.
   *
   * @param reservation the reservation
   */
  public void saveReservation(final ReservationDTO reservation);
  
  /**
   * Removes the reservation.
   *
   * @param reservation the reservation
   */
  public void removeReservation(final ReservationDTO reservation);
  
}
