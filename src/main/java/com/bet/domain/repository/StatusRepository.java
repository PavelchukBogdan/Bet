package com.bet.domain.repository;

import com.bet.domain.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * StatusRepository - репозиторий для работы со статусом ставки
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 13.07.2020
 */
public interface StatusRepository extends JpaRepository<Status,String> {


    Optional<Status> findByCode(String code);
}
