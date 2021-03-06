package com.bet.domain.repository;

import com.bet.domain.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MatchRepository - репозиторий для работы с матчем
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Repository
public interface MatchRepository extends JpaRepository<Match,String> {
}
