package com.bet.domain.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * EventTypeMatch - Сущшность для объеднения типа события и матча
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 09.07.2020
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "event_match")
public class EventTypeMatch {

    @EmbeddedId
    private EventTypeMatchId id;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("eventTypeId")
    private EventType eventType;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("matchId")
    private Match match;

    @ManyToMany(mappedBy = "eventTypeMatchSet")
    private Set<Bet> bets;


}
