package com.bet.domain.repository;

import com.bet.domain.entity.EventTypeMatch;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EventTypeMatchRepository -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public interface EventTypeMatchRepository extends JpaRepository<EventTypeMatch,String> {
}
