package com.bet.service;

import com.bet.domain.dto.KindOfSportDto;

import java.util.List;

/**
 * KindOfSportService - сервис для работы с видом спорта
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */
public interface KindOfSportService {

    List<KindOfSportDto> getKindsOfSport();
}
