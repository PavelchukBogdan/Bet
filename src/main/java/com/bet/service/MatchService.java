package com.bet.service;

import com.bet.domain.dto.MatchDto;

/**
 * MatchService - сервис для работы с матчем
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

public interface MatchService {

   MatchDto createMatch(MatchDto matchDto);
}
