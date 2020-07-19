package com.bet.domain.mapper;

import com.bet.domain.dto.BetDto;
import com.bet.domain.entity.Bet;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * BetMapper - mapper для сущности Bet
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */

@Mapper
public interface BetMapper {

    BetMapper BET_MAPPER = Mappers.getMapper(BetMapper.class);

    /**
     * преоброзование сущности Bet в dto
     * @param bet сущность ставки
     * @return  dto
     */
    @InheritInverseConfiguration
    BetDto mapBetToBetDto(Bet bet);

    /**
     * преоброзование dto в Bet
     * @param dto
     * @return bet
     */

    Bet mapBetDtoToBet(BetDto dto);


}
