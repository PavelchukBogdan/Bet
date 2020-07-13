package com.bet.domain.repository;

import com.bet.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * RoleRepository - репозиторий ролей пользователя
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 12.07.2020
 */

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {

    Optional<Role> findByRole(String role);
}
