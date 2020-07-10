package com.bet.domain.entity;

import com.sun.istack.internal.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;


/**
 * User - Пользователь
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
@Table(name = "users")
public class User extends Identifiable  {


    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String surname;

    @Column
    @NotNull
    private String fatherland;

    @Column
    @NotNull
    private LocalDateTime dateOfBirth;

    @Column
    @NotNull
    @Email
    private String email;

    @Column
    @NotNull
    private String password;

    @Column
    @NotNull
    private Long cashAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

}
