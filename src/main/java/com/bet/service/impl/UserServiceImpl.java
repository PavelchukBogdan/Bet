package com.bet.service.impl;

import com.bet.domain.dto.UserLogInDto;
import com.bet.domain.dto.UserSignUpDto;
import com.bet.domain.entity.Role;
import com.bet.domain.entity.User;
import com.bet.domain.mapper.UserMapper;
import com.bet.domain.repository.RoleRepository;
import com.bet.domain.repository.UserRepository;
import com.bet.security.UserDetailsImpl;
import com.bet.security.service.JwtService;
import com.bet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * UserServiceImpl - имплентация UserService
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final AuthenticationManager authenticationManager;

    private final JwtService jwtService;

    private static final String ROLE_NAME = "USER";

    private final PasswordEncoder passwordEncoder;


    /**
     * регистрация пользователей
     * @param userSignUpDto
     * @return воращает dto сущность
     */

    @Transactional
    @Override
    public UserSignUpDto signUp(UserSignUpDto userSignUpDto) {
      User user = userRepository.findByEmail(userSignUpDto.getEmail()).orElse(null);
      if(user != null){
          throw new IllegalArgumentException(String.format("Пользователь с email %s уже существует ", userSignUpDto.getEmail()));
      }
       user = UserMapper.USER_MAPPER.mapSignUpDtoToUser(userSignUpDto);
       user.setPassword(passwordEncoder.encode(userSignUpDto.getPassword()));

      Role role =  roleRepository.findByRole(ROLE_NAME).orElseThrow(()-> new IllegalArgumentException(String.format("Роли %s  в базе данных не существует", ROLE_NAME)));
      user.setRole(role);
     user = userRepository.save(user);
     UserSignUpDto resultDto =  UserMapper.USER_MAPPER.mapUserToSignUpDto(user);
     resultDto.setPassword(null);
     return resultDto;

    }

    /**
     * авторизация пользователей
     * @param userLogInDto
     * @return ворзащает токен пользователя
     */

    @Override
    public String logIn(UserLogInDto userLogInDto) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userLogInDto.getEmail(), userLogInDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtService.generateJwtToken(authentication);
        return jwt;
    }
}
