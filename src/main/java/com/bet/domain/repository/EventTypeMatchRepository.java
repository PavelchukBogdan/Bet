package com.bet.domain.repository;

import com.bet.domain.entity.EventTypeMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EventTypeMatchRepository - репозиторий свящывающий тип события и матча
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Repository
public interface EventTypeMatchRepository extends JpaRepository<EventTypeMatch,String> {
}
