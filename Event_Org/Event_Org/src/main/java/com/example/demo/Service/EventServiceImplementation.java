package com.example.demo.Service;

import com.example.demo.Repository.EventRepo;
import com.example.demo.pojos.Event;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Transactional
@Service
public class EventServiceImplementation implements EventService{
    @Autowired
    private EventRepo repo;
    @Override
    public List<Event> findAllEvents() {
        return repo.findAll();
    }

    @Override
    public Event addNewEvent(Event newEvent) {
        return repo.save(newEvent);
    }

    @Override
    public String removeEvent(Long id) {
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Deleted";
        }

        return "Failed to deleted";
    }

    @Override
    public Event updateEvent(Event newEvent) {
        return null;
    }
}
