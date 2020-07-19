package com.bet.service.impl;

import com.bet.domain.dto.BetDto;
import com.bet.domain.dto.CreateBetDto;
import com.bet.domain.entity.*;
import com.bet.domain.entity.constants.StatusCodes;
import com.bet.domain.mapper.BetMapper;
import com.bet.domain.repository.*;
import com.bet.service.BetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * BetServiceImpl - имплементация BetService
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */

@RequiredArgsConstructor
@Service
public class BetServiceImpl implements BetService {

    private final BetRepository betRepository;

    private final MatchRepository matchRepository;

    private final EventTypeRepository eventTypeRepository;

    private final EventsAndBetsSummaryRepository eventsAndBetsSummaryRepository;

    private final UserRepository userRepository;

    private final StatusRepository statusRepository;

    private final BookmakerCashAccountRepository bookmakerCashAccountRepository;


    @Transactional
    @Override
    public BetDto createBet(CreateBetDto dto) {

        Bet bet = BetMapper.BET_MAPPER.mapBetDtoToBet(dto.getBetDto());
        bet = betRepository.save(bet);

        Optional<EventType> eventType = eventTypeRepository.findById(dto.getEventType());
        Optional<Match> match = matchRepository.findById(dto.getMatch());
        EventsAndBetsSummary eventsAndBetsSummary  = new EventsAndBetsSummary();
        eventsAndBetsSummary.setBet(bet);
        eventsAndBetsSummary.setMatch(match.orElseThrow(()-> new IllegalArgumentException(String.format("Не найден матч с id: %s",dto.getMatch()))));
        eventsAndBetsSummary.setEventType(eventType.orElseThrow(()-> new IllegalArgumentException(String.format("Не найден тип собыйтий с id: %s", dto.getEventType()))));
        eventsAndBetsSummaryRepository.save(eventsAndBetsSummary);
        User user = bet.getUser();
        user.setCashAccount(user.getCashAccount()- bet.getInvested());
        userRepository.save(user);
      BookmakerCashAccount bookmakerCashAccount = bookmakerCashAccountRepository.findAll().stream().findFirst().orElseThrow(()-> new IllegalArgumentException("Не найден денежный счет"));
      bookmakerCashAccount.setCash(user.getCashAccount() + bookmakerCashAccount.getCash());


        BetDto betDto = BetMapper.BET_MAPPER.mapBetToBetDto(bet);

        return betDto;


    }

    @Transactional
    @Override
    public void updateBet(Map<String, Boolean> betResultMap) {
        betResultMap.forEach((id, betWon) -> {
            Bet bet = betRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(String.format("Данная ставка %s, не найдена", id)));
            bet.setStatus(statusRepository.findByCode(StatusCodes.NOT_ACTIVE).orElseThrow(() -> new IllegalArgumentException(String.format("Статус с кодом %s не найден", StatusCodes.NOT_ACTIVE))));
            if(betWon){
                bet.setResult(bet.getInvested()* bet.getCoefficientBet());
                betRepository.save(bet);
               User user = bet.getUser();
               user.setCashAccount(bet.getResult()+ user.getCashAccount());
               userRepository.save(user);
               BookmakerCashAccount bookmakerCashAccount = bookmakerCashAccountRepository.findAll().stream().findFirst().orElseThrow(()-> new IllegalArgumentException("Не найден денежный счет"));
               bookmakerCashAccount.setCash(bookmakerCashAccount.getCash() - bet.getResult());
               bookmakerCashAccountRepository.save(bookmakerCashAccount);
            }
        });
    }

}
