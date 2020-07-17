package com.bet.domain.mapper;

import com.bet.domain.dto.EventTypeDto;
import com.bet.domain.entity.EventType;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * EventTypeMapper - mapper сущности  EventType
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Mapper
public interface EventTypeMapper {

    EventTypeMapper EVENT_TYPE_MAPPER = Mappers.getMapper(EventTypeMapper.class);


    /**
     *  преоброзовние сущности dto в сущность EventType
     * @param dto
     * @return возращает evetType
     */
    @InheritInverseConfiguration
    EventType mapEventTypeDtoToEventType(EventTypeDto dto);


    /**
     *  преоброзование сушности EventType  в сущность dto
     * @param eventType
     * @return возращает dto
     *
     */

    EventTypeDto mapEventTypeToEventTypeDto(EventType eventType);
}

