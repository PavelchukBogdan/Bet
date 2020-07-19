package com.bet.domain.dto;

import com.bet.domain.entity.Match;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * CreateBetDto - dto для создания ставки
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateBetDto {

    @NotNull
    private BetDto betDto;

    @NotNull
    private String match;

    @NotNull
    private String eventType;
}
