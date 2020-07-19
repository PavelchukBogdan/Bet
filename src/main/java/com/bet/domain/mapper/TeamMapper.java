package com.bet.domain.mapper;

import com.bet.domain.dto.TeamDto;
import com.bet.domain.entity.Team;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * TeamMapper - mapper для сущности Team
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Mapper
public interface TeamMapper {

    TeamMapper TEAM_MAPPER = Mappers.getMapper(TeamMapper.class);

    /**
     * преоброзование сущности dto в сущность Team
     *
     * @param dto
     * @return возращет team
     */

    @InheritInverseConfiguration
    Team mapTeamDtoToTeam(TeamDto dto);



    /**
     * преоброзование сущности Team в dto
     *
     * @param team
     * @return возращет dto
     */

    TeamDto mapTeamDtoToTeam(Team team);

}
