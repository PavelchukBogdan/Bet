package com.bet.domain.repository;

import com.bet.domain.entity.EventType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EvenTypeRepository -
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */
public interface EvenTypeRepository extends JpaRepository<EventType,String> {
}
