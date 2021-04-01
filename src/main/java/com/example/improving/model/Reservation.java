package com.example.improving.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Reservation.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@ToString
public class Reservation implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -6443892383364855793L;

  /** The id. */
  @Id
  @GeneratedValue
  private Integer id;
  
  /** The name. */
  private String name;
  
  /** The time. */
  private LocalDateTime time;
  
}
