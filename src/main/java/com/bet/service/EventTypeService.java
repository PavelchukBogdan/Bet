package com.bet.service;

import com.bet.domain.dto.EventTypeDto;

import java.util.List;

/**
 * EventTypeService - сервис для работы с типом событий
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */
public interface EventTypeService {

    List<EventTypeDto> getEventTypesByKindOfSport(String kindOfSport);
}
