package com.bet.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * EventType - Тип события
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 09.07.2020
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "event_type")
public class EventType extends Identifiable {

    @Column
    @NotBlank
    private String eventType;

    @NotBlank
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "kind_of_sport_id")
    private KindOfSport kindOfSport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "even_time_id", nullable = false)
    private EventTime eventTime;


}
