package com.bet.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * UserLogInDto - dto для авторизации пользователя
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 11.07.2020
 */



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserLogInDto {

    @NotBlank
    private String password;

    @Email
    @NotBlank
    private String email;
}
