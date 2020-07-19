package com.bet.service;

import com.bet.domain.dto.TeamDto;

import java.util.List;

/**
 * TeamService - сервис для работы с командами
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */
public interface TeamService {

    List<TeamDto> getTeamsByKindOfSport(String kindOfSport);
}
