package com.bet.controller;

import com.bet.service.KindOfSportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * KindOfSportController - контроллер для работы с видами спорта
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 17.07.2020
 */

@Api(description = "Контроллер для работы с видами спорта")
@RestController
@RequiredArgsConstructor
@RequestMapping("/kind_of_sports")
public class KindOfSportController {

    private final KindOfSportService kindOfSportService;


    @ApiOperation(value = "Получение всех видов спорта " )
    @ApiResponse(code = 200, message = "Успешное выполнение")
    @GetMapping
    public ResponseEntity<?> getKindsOfSport(){
        return ResponseEntity.ok(kindOfSportService.getKindsOfSport());

    }
}
