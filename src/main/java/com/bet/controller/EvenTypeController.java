package com.bet.controller;

import com.bet.service.EventTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EvenTypeController - контроллер для работы с типом событий
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Api(description = "Редактирвание и создание типов событий")
@RestController
@RequiredArgsConstructor
@RequestMapping("/event_types")
public class EvenTypeController {

    private final EventTypeService eventTypeService;

    @ApiOperation(value = "Получение всех  типов событий в зависимости от вида спорта спорта " )
    @ApiResponse(code = 200, message = "Успешное выполнение")
    @GetMapping
    public ResponseEntity<?> getEventTypesByKindOfSport(String kindOfSportId){
        return ResponseEntity.ok(eventTypeService.getEventTypesByKindOfSport(kindOfSportId));
    }
}
