package com.bet.domain.repository;

import com.bet.domain.entity.KindOfSport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * KindOfSportRepository -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public interface KindOfSportRepository extends JpaRepository<KindOfSport,String> {
}
