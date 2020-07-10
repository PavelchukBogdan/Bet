package com.bet.domain.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

/**
 * Team - Спортивные команды
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
@Table(name = "team")
public class Team extends Identifiable {

    @Column
    @NotNull
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kind_of_sport_id", nullable = false)
    private KindOfSport kindOfSport;
}
