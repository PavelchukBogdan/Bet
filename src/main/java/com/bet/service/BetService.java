package com.bet.service;

import com.bet.domain.dto.BetDto;
import com.bet.domain.dto.CreateBetDto;

import java.util.List;
import java.util.Map;

/**
 * BetService - сервис для работы со ставкой
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */
public interface BetService {

  BetDto createBet(CreateBetDto dto);

  void updateBet(Map<String,Boolean> betResultMap);
}
