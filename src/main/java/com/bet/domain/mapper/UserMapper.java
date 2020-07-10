package com.bet.domain.mapper;

import com.bet.domain.dto.UserSignUpDto;
import com.bet.domain.entity.User;

/**
 * UserMapper -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public class UserMapper {

    public static User mapSignUpDtoToUser(UserSignUpDto dto){
        User user = new User();
        user.setDateOfBirth(dto.getDateOfBirth());
        user.setEmail(dto.getEmail());
        user.setName(dto.getName());
        user.setFatherland(dto.getFatherland());
        user.setSurname(dto.getSurname());
        user.setPassword(dto.getPassword());
        return user;
    }

    public static UserSignUpDto mapUserToSignUpDto(User user){
        UserSignUpDto userSignUpDto = new UserSignUpDto();
        userSignUpDto.setDateOfBirth(user.getDateOfBirth());
        userSignUpDto.setEmail(user.getEmail());
        userSignUpDto.setName(user.getName());
        userSignUpDto.setFatherland(user.getFatherland());
        userSignUpDto.setSurname(user.getSurname());
        userSignUpDto.setPassword(user.getPassword());
        return userSignUpDto;
    }
}
