package com.bet.domain.repository;

import com.bet.domain.entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BetRepository - репозиторий для работы со ставками
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Repository
public interface BetRepository extends JpaRepository<Bet,String> {
}
