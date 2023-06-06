package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
