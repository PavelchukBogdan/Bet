package com.bet.controller;

import com.bet.domain.dto.UserSignUpDto;
import com.bet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * UserController -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> signUp(@Valid UserSignUpDto userSignUpDto){
        return ResponseEntity.ok(userService.signUp(userSignUpDto));
    }
}
