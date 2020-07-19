package com.bet.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * KindOfSportDto - dto для создания вида спорта
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KindOfSportDto {


    private String id;

    @NotBlank
    private String kindOfSport;
}
