package com.bet.domain.repository;

import com.bet.domain.entity.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EvenTypeRepository - репозиторий для работы с типом события
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 10.07.2020
 */

@Repository
public interface EventTypeRepository extends JpaRepository<EventType,String> {

    List<EventType> findAllByKindOfSportId(String kindOfSportId);
}
