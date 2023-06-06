package com.example.demo.Service;

import com.example.demo.pojos.Event;

import java.util.List;

public interface EventService {
    List <Event>findAllEvents();
    Event addNewEvent(Event newEvent);
    String removeEvent(Long id);
    Event updateEvent(Event newEvent);
}
