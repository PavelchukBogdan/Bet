package com.bet.domain.repository;

import com.bet.domain.entity.EventTypeMatchId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EventTypeMatchIdRepository -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public interface EventTypeMatchIdRepository extends JpaRepository<EventTypeMatchId,String> {
}
