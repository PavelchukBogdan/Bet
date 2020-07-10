package com.bet.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * EventTypeMatchId - Сущность для генерации id  типа события и матча
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 09.07.2020
 */


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EventTypeMatchId implements Serializable {

    @Column(name = "event_type_id")
    private String eventTypeId;

    @Column(name = "match_id")
    private String matchId;
}
