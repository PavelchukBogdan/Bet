package com.bet.controller;

import com.bet.domain.dto.UserLogInDto;
import com.bet.service.UserService;
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

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {


    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> logIn(@RequestBody UserLogInDto userLogInDto){
        return ResponseEntity.ok(userService.logIn(userLogInDto));
    }
}
