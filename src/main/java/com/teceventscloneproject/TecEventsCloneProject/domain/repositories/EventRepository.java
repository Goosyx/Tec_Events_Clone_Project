package com.teceventscloneproject.TecEventsCloneProject.domain.repositories;

import com.teceventscloneproject.TecEventsCloneProject.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
