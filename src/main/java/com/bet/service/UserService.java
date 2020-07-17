package com.bet.service;

import com.bet.domain.dto.UserLogInDto;
import com.bet.domain.dto.UserSignUpDto;

/**
 * UserService - сервис для работы с пользователями
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public interface UserService {

     UserSignUpDto signUp(UserSignUpDto userSignUpDto);
     String logIn(UserLogInDto userLogInDto);

}
