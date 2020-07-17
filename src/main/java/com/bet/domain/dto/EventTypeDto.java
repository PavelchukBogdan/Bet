package com.bet.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * EventTypeDto - dto для создание типов событий
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EventTypeDto {

    @NotBlank
    private String id;

    @NotBlank
    private String eventType;

    @NotBlank
    private KindOfSportDto kindOfSportDto;
}
