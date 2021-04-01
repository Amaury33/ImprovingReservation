package com.example.improving.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class ReservationDTO.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ReservationDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -6443892383364855793L;

  /** The id. */
  private Integer id;

  /** The name. */
  private String name;

  /** The time. */
  private LocalDateTime time;

}
