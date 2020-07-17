package com.bet.controller;

import com.bet.service.TeamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TeamController - котроллер для работы с командами
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Api(description = "Редактирвание и создание  спортивных команд")
@RestController
@RequiredArgsConstructor
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;


    @ApiOperation(value = "Получение всех команд в зависимости от вида спорта спорта " )
    @ApiResponse(code = 200, message = "Успешное выполнение")
    @GetMapping
    public ResponseEntity<?> getTeamsByKindOfSport(String kindOfSportId){
        return ResponseEntity.ok(teamService.getTeamsByKindOfSport(kindOfSportId));

    }
}
