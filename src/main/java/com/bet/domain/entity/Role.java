package com.bet.domain.entity;


import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Role - Роль пользователя
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 09.07.2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "role")
public class Role  extends Identifiable{

    @Column
    @NotNull
    private String role;

}
