package com.bet.domain.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Bet- Ставка
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
@Table(name = "bet")
public class Bet extends Identifiable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column
    @NotNull
    private LocalDateTime betDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    private Status status;

    @Column
    @NotNull
    private Long invested;

    @Column
    @NotNull
    private Long result;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "bet_event_type_match",
            joinColumns = { @JoinColumn(name = "bet_id") },
            inverseJoinColumns = {
                    @JoinColumn(name = "event_type_id"),
                    @JoinColumn(name = "match_id")}
    )
    private Set<EventTypeMatch> eventTypeMatchSet = new HashSet<>();


}
