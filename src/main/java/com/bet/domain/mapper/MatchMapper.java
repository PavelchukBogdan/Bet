package com.bet.domain.mapper;

import com.bet.domain.dto.MatchDto;
import com.bet.domain.entity.Match;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * MatchMapper - mapper сущности Match
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */


@Mapper
public interface MatchMapper {
     MatchMapper MATCH_MAPPER = Mappers.getMapper(MatchMapper.class);


    /**
     *  преоброзовние сущности dto в сущность match
     * @param dto
     * @return возращает match
     */

    @InheritInverseConfiguration
     Match mapMatchDtoToMatch(MatchDto dto);


    /**
     *  преоброзование сушности match  в сущность dto
     * @param match
     * @return возращает dto
     *
     */

    MatchDto mapMatchToMatchDto(Match match);
}
