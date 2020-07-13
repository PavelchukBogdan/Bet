package com.bet.domain.repository;

import com.bet.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * UserRepository - репозиторий для работы с пользователями
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Repository
public interface UserRepository extends JpaRepository<User,String> {

   Optional<User> findByEmail(String email);


}
