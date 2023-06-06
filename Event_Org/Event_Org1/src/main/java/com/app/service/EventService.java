package com.app.service;
import java.util.List;

import com.app.pojos.Event;


public interface EventService {
	  	List<Event> findAllEvents();
	    Event addNewEvent(Event newEvent);
	    String removeEvent(Long id);
	    Event updateEvent(Event newEvent);
}
