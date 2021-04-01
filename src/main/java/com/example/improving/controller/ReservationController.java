package com.example.improving.controller;

import com.example.improving.dto.ReservationDTO;
import com.example.improving.model.Reservation;
import com.example.improving.service.ReservationService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class ReservationController.
 */
@RestController
@Slf4j
public class ReservationController {
	
	/** The reservation service. */
	@Autowired
	ReservationService reservationService;
	
	/**
	 * Gets the reservations.
	 *
	 * @return the reservations
	 */
	@GetMapping(value="/reservations")
	public List<Reservation> getReservations() {
	  log.info("Getting all reservations from the database.");
      return reservationService.getReservations();
    }
	
    /**
     * Save reservation.
     *
     * @param reservation the reservation
     */
    @PostMapping(value="/saveReservation")
    public void saveReservation(@RequestBody ReservationDTO reservation) {
      log.info("Saving reservation " + reservation);
      reservationService.saveReservation(reservation);
    }
    
    /**
     * Remove reservation.
     *
     * @param reservation the reservation
     */
    @DeleteMapping(value="/removeReservation")
    public void removeReservation(@RequestBody ReservationDTO reservation) {
      log.info("Removing reservation " + reservation);
      reservationService.removeReservation(reservation);
    }
}
