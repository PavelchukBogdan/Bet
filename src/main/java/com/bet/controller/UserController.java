package com.bet.controller;

import com.bet.domain.dto.UserSignUpDto;
import com.bet.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * UserController - контроллер для работы с пользователями
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Api(description = "Регистрация пользователей.")
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;


    @ApiOperation(value = "Регистрация нового пользователя " )
    @ApiResponse(code = 200, message = "Успешное выполнение")
    @PostMapping
    public ResponseEntity<?> signUp(@RequestBody UserSignUpDto userSignUpDto){
        return ResponseEntity.ok(userService.signUp(userSignUpDto));
    }
}
