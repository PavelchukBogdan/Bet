package com.bet.domain.repository;

import com.bet.domain.entity.EventsAndBetsSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * EventsAndBetsSummaryRepository - репозиторий для сущности, которая определяет связь ставки, типа события и матча
 *
 * @author Павельчук Богдан (pavelchuk.b)
 * @since 18.07.2020
 */
@Repository
public interface EventsAndBetsSummaryRepository extends JpaRepository<EventsAndBetsSummary, String> {

}
