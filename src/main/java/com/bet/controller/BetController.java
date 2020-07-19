package com.bet.controller;

import com.bet.domain.dto.CreateBetDto;
import com.bet.service.BetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BetController - контроллер для создания ставки
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */


@Api(description = "Работа со ставками ")
@RestController
@RequiredArgsConstructor
@RequestMapping("/bets")
public class BetController {

    private final BetService betService;


    @ApiOperation(value = "Создание новой ставки ")
    @ApiResponse(code = 200, message = "Успешное создание")
    @PostMapping
    public ResponseEntity<?> createBet(@RequestBody CreateBetDto dto) {
        return ResponseEntity.ok(betService.createBet(dto));

    }


}
