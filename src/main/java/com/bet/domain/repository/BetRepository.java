package com.bet.domain.repository;

import com.bet.domain.entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * BetRepository -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public interface BetRepository extends JpaRepository<Bet,String> {
}
