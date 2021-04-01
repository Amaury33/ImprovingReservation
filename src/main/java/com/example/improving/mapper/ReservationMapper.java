package com.example.improving.mapper;

import com.example.improving.dto.ReservationDTO;
import com.example.improving.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * The Class ReservationMapper.
 */
@Mapper
public interface ReservationMapper {

  /** The reservation mapper. */
  ReservationMapper INSTANCE =
      Mappers.getMapper(ReservationMapper.class);
  
  /**
   * Reservation DTO to reservation.
   *
   * @param reservation the reservation
   * @return the reservation
   */
  @Mapping(source = "reservationDto.id", target = "id")
  @Mapping(source = "reservationDto.name", target = "name")
  @Mapping(source = "reservationDto.time", target = "time")
  Reservation reservationDTOToReservation(ReservationDTO reservationDto);

  /**
   * Reservation to reservation DTO.
   *
   * @param reservation the reservation
   * @return the reservation DTO
   */
  @Mapping(source = "reservation.id", target = "id")
  @Mapping(source = "reservation.name", target = "name")
  @Mapping(source = "reservation.time", target = "time")
  ReservationDTO reservationToReservationDTO(Reservation reservation);
}
