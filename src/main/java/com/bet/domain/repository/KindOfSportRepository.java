package com.bet.domain.repository;

import com.bet.domain.entity.KindOfSport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * KindOfSportRepository - репозиторий для работы с видами спорта
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Repository
public interface KindOfSportRepository extends JpaRepository<KindOfSport,String> {
}
