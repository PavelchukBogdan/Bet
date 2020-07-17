package com.bet.service.impl;

import com.bet.domain.dto.KindOfSportDto;
import com.bet.domain.entity.KindOfSport;
import com.bet.domain.mapper.KindOfSportMapper;
import com.bet.domain.repository.KindOfSportRepository;
import com.bet.service.KindOfSportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * KindOfSportServiceImpl - имплементация KindOfSportService
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@RequiredArgsConstructor
@Service
public class KindOfSportServiceImpl implements KindOfSportService {

    private final KindOfSportRepository kindOfSportRepository;


    @Override
    public List<KindOfSportDto> getKindsOfSport() {
        List<KindOfSport> kindOfSports = kindOfSportRepository.findAll();
         List<KindOfSportDto> kindOfSportDtos = new ArrayList<>();
         kindOfSports.forEach(kindOfSport -> {
             kindOfSportDtos.add(KindOfSportMapper.KIND_OF_SPORT_MAPPER.mapKindOfSportToKindOfSportDto(kindOfSport));
         });

         return kindOfSportDtos;
    }
}
