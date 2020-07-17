package com.bet.service.impl;

import com.bet.domain.dto.MatchDto;
import com.bet.domain.entity.Match;
import com.bet.domain.mapper.MatchMapper;
import com.bet.domain.repository.MatchRepository;
import com.bet.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * MatchServiceImpl - имплементация сервиса для работы с мачтем
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@RequiredArgsConstructor
@Service
public class MatchServiceImpl  implements MatchService {

    private final MatchRepository matchRepository;


    @Override
    public MatchDto createMatch(MatchDto matchDto) {
        Match match = MatchMapper.MATCH_MAPPER.mapMatchDtoToMatch(matchDto);
        match.setGuestTeamScore(0);
        match.setHomeTeamScore(0);
        match = matchRepository.save(match);
        return MatchMapper.MATCH_MAPPER.mapMatchToMatchDto(match);


    }
}
