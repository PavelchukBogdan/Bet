package com.bet.domain.repository;

import com.bet.domain.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TeamRepository - репозиторий для работы с командами
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 13.07.2020
 */

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {

    List<Team> findAllByKindOfSportId(String kindOfSportId);
}
