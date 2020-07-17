package com.bet.service.impl;

import com.bet.domain.dto.EventTypeDto;
import com.bet.domain.entity.EventType;
import com.bet.domain.mapper.EventTypeMapper;
import com.bet.domain.repository.EventTypeRepository;
import com.bet.service.EventTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * EventTypeServiceImpl - имплементация EventService
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@RequiredArgsConstructor
@Service
public class EventTypeServiceImpl implements EventTypeService {

    private final EventTypeRepository eventTypeRepository;

    @Override
    public List<EventTypeDto> getEventTypesByKindOfSport(String kindOfSport) {
        List<EventType> eventTypes = eventTypeRepository.findAllByKindOfSportId(kindOfSport);
        List<EventTypeDto> eventTypeDtos = new ArrayList<>();
        eventTypes.forEach(eventType -> {
           eventTypeDtos.add(EventTypeMapper.EVENT_TYPE_MAPPER.mapEventTypeToEventTypeDto(eventType));
        });
        return eventTypeDtos;
    }
}
