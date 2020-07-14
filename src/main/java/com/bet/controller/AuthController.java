package com.bet.controller;

import com.bet.domain.dto.UserLogInDto;
import com.bet.service.UserService;
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
 * AuthController - контроллер для авторизации пользователей
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 11.07.2020
 */


@Api(description = "Авторизация пользователей.")
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {


    private final UserService userService;

    @ApiOperation(value = "Авторизация  пользователя " )
    @ApiResponse(code = 200, message = "Успешное выполнение")
    @PostMapping
    public ResponseEntity<?> logIn(@RequestBody UserLogInDto userLogInDto){
        return ResponseEntity.ok(userService.logIn(userLogInDto));
    }
}
