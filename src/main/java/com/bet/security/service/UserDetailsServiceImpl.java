package com.bet.security.service;

import com.bet.domain.entity.User;
import com.bet.domain.repository.UserRepository;
import com.bet.security.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * UserDetailsServiceImpl - имплементация UserDetailsService
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 11.07.2020
 */

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {


  private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(email)
                .orElseThrow(()-> new IllegalArgumentException(String.format("Пользователь с email %s не найден ",email )));
        return UserDetailsImpl.build(user);

    }
}
