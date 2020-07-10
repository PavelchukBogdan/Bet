package com.bet.service.impl;

import com.bet.domain.dto.UserSignUpDto;
import com.bet.domain.entity.User;
import com.bet.domain.mapper.UserMapper;
import com.bet.domain.repository.UserRepository;
import com.bet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserSignUpDto signUp(UserSignUpDto userSignUpDto) {
        User user = UserMapper.mapSignUpDtoToUser(userSignUpDto);
        user = userRepository.save(user);
        return UserMapper.mapUserToSignUpDto(user);

    }
}
