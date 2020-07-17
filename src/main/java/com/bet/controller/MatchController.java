package com.bet.controller;

import com.bet.domain.dto.MatchDto;
import com.bet.service.MatchService;
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
 * MatchController - контроллер для работы с матчем
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Api(description = "Редактирвание и создание матчей")
@RestController
@RequiredArgsConstructor
@RequestMapping("/matches")
public class MatchController {


    private final MatchService matchService;


    @ApiOperation(value = "Создание нового матча " )
    @ApiResponse(code = 200, message = "Успешное выполнение")
    @PostMapping
    public ResponseEntity<?> createMatch(@RequestBody MatchDto matchDto){
        return ResponseEntity.ok(matchService.createMatch(matchDto));
    }
}
