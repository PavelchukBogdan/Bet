package com.bet.domain.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Status - Статус ставки
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
@Table(name = "status")
public class Status extends Identifiable {

    @Column
    @NotNull
    private String status;
}
