package com.bet.domain.dto;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * UserSignUpDto -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserSignUpDto {


    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String fatherland;

    @NotBlank
    private LocalDateTime dateOfBirth;

    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
