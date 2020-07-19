package com.bet.service.impl;

import com.bet.domain.dto.TeamDto;
import com.bet.domain.entity.Team;
import com.bet.domain.mapper.TeamMapper;
import com.bet.domain.repository.TeamRepository;
import com.bet.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * TeamSeviceImpl -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@RequiredArgsConstructor
@Service
public class TeamSeviceImpl implements TeamService {

    private final TeamRepository teamRepository;

    @Override
    public List<TeamDto> getTeamsByKindOfSport(String kindOfSport) {

        List<Team> teams = teamRepository.findAllByKindOfSportId(kindOfSport);
        List<TeamDto> teamDtos = new ArrayList<>();
        teams.forEach(team -> {
            teamDtos.add(TeamMapper.TEAM_MAPPER.mapTeamDtoToTeam(team));
        });

        return teamDtos;

    }
}
