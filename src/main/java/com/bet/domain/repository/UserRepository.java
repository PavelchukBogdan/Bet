package com.bet.domain.repository;

import com.bet.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public interface UserRepository extends JpaRepository<User,String> {
}
