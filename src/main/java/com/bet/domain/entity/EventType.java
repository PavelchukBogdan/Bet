package com.bet.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column
    @NotNull
    private String eventTypeName;

    @NotNull
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "event_type_id")
    private KindOfSport kindOfSport;
}
