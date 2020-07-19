package com.bet.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * EventTime - сущность для временного отрезка типа события
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */


@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table(name = "event_time")
public class EventTime extends Identifiable {

    @NotBlank
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kind_of_sport_id", nullable = false)
    private KindOfSport kindOfSport;

}
