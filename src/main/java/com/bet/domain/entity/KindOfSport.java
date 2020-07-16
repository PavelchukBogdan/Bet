package com.bet.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * KindOfSport - Виды спорта
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
@Table(name = "kind_of_sport")
public class KindOfSport  extends Identifiable{

    @Column
    @NotNull
    private String kindOfSport;

    @OneToMany(mappedBy = "kindOfSport")
    private List<EventType> eventTypes;

    @OneToMany(mappedBy = "kindOfSport")
    private List<Team> teams;
}
