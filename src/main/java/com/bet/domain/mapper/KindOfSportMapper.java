package com.bet.domain.mapper;

import com.bet.domain.dto.KindOfSportDto;
import com.bet.domain.entity.KindOfSport;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * KindOfSportMapper - mapper сущности KindOfSport
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Mapper
public interface KindOfSportMapper {

    KindOfSportMapper KIND_OF_SPORT_MAPPER = Mappers.getMapper(KindOfSportMapper.class);


    /**
     *  преоброзовние сущности dto в сущность kindOfSport
     * @param dto
     * @return возращает kindOfSport
     */

    @InheritInverseConfiguration
    KindOfSport mapKindOfSportDtoToKindOfSport(KindOfSportDto dto);


    /**
     *  преоброзование сушности kindOfSport  в сущность dto
     * @param kindOfSport
     * @return возращает dto
     *
     */

    KindOfSportDto mapKindOfSportToKindOfSportDto(KindOfSport kindOfSport);
}
