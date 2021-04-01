package com.example.improving;

import com.example.improving.model.Reservation;
import com.example.improving.repository.ReservationRepository;
import com.example.improving.service.ReservationService;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Class ImprovingApplication.
 */
@SpringBootApplication
public class ImprovingApplication implements CommandLineRunner {
  
    /** The reservation service. */
    @Autowired
    ReservationService reservationService;
  
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ImprovingApplication.class, args);
	}

	/**
	 * Run.
	 *
	 * @param args the args
	 * @throws Exception the exception
	 */
	@Override
	public void run(String... args) throws Exception {
	  //Load some dummy data.
	  
	  //Using IntStream
	  IntStream.range(0, 15).forEach(
	      i -> reservationService.saveReservation(
	          Reservation.builder()
	          .id(i)
	          .name("Reservation No. "
	              + ThreadLocalRandom.current().nextInt(0, 100))
	          .time(LocalDateTime.now())
	          .build()));
	}

}
