package com.bet.domain.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Match - Матч(спортивное событие)
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
@Table(name = "match")
public class Match extends Identifiable {

    @Column
    @NotNull
    private LocalDateTime dateEvent;

    @Column
    @NotNull
    private String nameEvent;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_team_id", nullable = false)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "guest_team_id", nullable = false)
    private Team team1;

    @OneToMany(mappedBy = "match",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<EventTypeMatch> matches = new ArrayList<>();


}
