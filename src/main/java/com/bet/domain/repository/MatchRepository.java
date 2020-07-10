package com.bet.domain.repository;

import com.bet.domain.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MatchRepository -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public interface MatchRepository extends JpaRepository<Match,String> {
}
