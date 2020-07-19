package com.bet.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * TeamDto - dto для создании команд
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {


    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private KindOfSportDto kindOfSportDto;
}
