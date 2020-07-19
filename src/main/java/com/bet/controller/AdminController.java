package com.bet.controller;

import com.bet.domain.dto.MatchDto;
import com.bet.service.BetService;
import com.bet.service.MatchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * AdminController - контроллер для администрирования
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 19.07.2020
 */

@Api(description = "Администрирование ")
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final BetService betService;

    private final MatchService matchService;


    @ApiOperation(value = "Обновление результата ставки " )
    @ApiResponse(code = 200, message = "Успешное оьновление")
    @PatchMapping("/bets")
    public ResponseEntity<?> updateBet(@RequestBody Map<String, Boolean> betResultMap) {
        betService.updateBet(betResultMap);
        return ResponseEntity.ok().build();
    }


    @ApiOperation(value = "Создание нового спортивного события на которого монжно поставить " )
    @ApiResponse(code = 200, message = "Успешное выполнение")
    @PostMapping("/matches")
    public ResponseEntity<?> createMatch(@RequestBody MatchDto matchDto){
        return ResponseEntity.ok(matchService.createMatch(matchDto));
    }
}
