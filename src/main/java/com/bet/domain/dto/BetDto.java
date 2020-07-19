package com.bet.domain.dto;

import com.bet.domain.entity.Status;
import com.bet.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * BetDto - dto для сущности Bet
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BetDto {


    private String id;

    @NotBlank
    private LocalDateTime betDate;

    @NotBlank
    private Double invested;

    @NotBlank
    private Double result;

    @NotBlank
    private User user;

    @NotBlank
    private Status status;

    @NotNull
    private Double coefficientBet;





}
