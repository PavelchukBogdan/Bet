package com.bet.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * BookmakerCashAccount - сущность денежного счета букмерской конторы
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 19.07.2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookmaker_cash_account")
public class BookmakerCashAccount extends Identifiable {

    @Column
    @NotNull
    private Double cash;
}
