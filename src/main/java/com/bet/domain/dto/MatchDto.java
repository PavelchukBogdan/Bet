package com.bet.domain.dto;

import com.bet.domain.entity.KindOfSport;
import com.bet.domain.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * MatchDto - dto для создания матча
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MatchDto {

    @NotBlank
    private Team homeTeam;

    @NotBlank
    private Team guestTeam;

    @NotBlank
    private KindOfSport kindOfSport;

    @NotBlank
    private LocalDateTime matchDate;

    @NotBlank
    private String matchName;
}
