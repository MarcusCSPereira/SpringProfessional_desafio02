package com.marcuscspereira.desafio02.entities;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_timeblock")
public class TimeBlock {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "start_time", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant start;

  @Column(name = "end_time", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant endTime;

  //Relacionamentos:
  
  //Muitos para um com Atividade
  @ManyToOne
  @JoinColumn(name = "activity_id")
  private Activity activity;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Instant getStart() {
    return start;
  }

  public void setStart(Instant start) {
    this.start = start;
  }

  public Instant getEndTime() {
    return endTime;
  }

  public void setEndTime(Instant endTime) {
    this.endTime = endTime;
  }

  public Activity getActivity() {
    return activity;
  }
  

}
