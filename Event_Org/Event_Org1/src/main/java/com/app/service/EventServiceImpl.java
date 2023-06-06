package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Event;
import com.app.repository.EventRepository;


@Service
@Transactional
public class EventServiceImpl implements EventService {
	
	@Autowired
	private EventRepository repo;

	@Override
	public List<Event> findAllEvents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Event addNewEvent(Event newEvent) {
		// TODO Auto-generated method stub
		return repo.save(newEvent);
	}

	@Override
	public String removeEvent(Long id) {
		// TODO Auto-generated method stub
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return "Deleted";
		}
		return "Deletion failed";
	}

	@Override
	public Event updateEvent(Event newEvent) {
		// TODO Auto-generated method stub
		return null;
	}

}
