package com.bet.domain.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @NotNull
    private String eventType;

    @OneToMany(mappedBy = "eventType",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<EventTypeMatch> eventTypes = new ArrayList<>();
}
