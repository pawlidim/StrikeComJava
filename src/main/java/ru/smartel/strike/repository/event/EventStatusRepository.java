package ru.smartel.strike.repository.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.smartel.strike.entity.reference.EventStatus;

@Repository
public interface EventStatusRepository extends JpaRepository<EventStatus, Long> {
}
