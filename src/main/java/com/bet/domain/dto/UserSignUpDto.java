package com.bet.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    private LocalDateTime dateOfBirth;

    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
