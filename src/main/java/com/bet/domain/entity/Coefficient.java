package com.bet.domain.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Coefficient -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "coefficient")
public class Coefficient extends Identifiable {

    @NotNull
    @Column
    private Double coefficient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_type_id", nullable =  false)
    private EventType eventType;

}
