package com.example.demo.controller;

import com.example.demo.Service.EventService;
import com.example.demo.pojos.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")

public class EventController {
    @Autowired
    EventService eService;

    public EventController() {

    }
    @GetMapping
    public List<Event> getAll() {
        return eService.findAllEvents();
    }
    @PostMapping
    public Event addEvent(Event e1) {
        return eService.addNewEvent(e1);
    }


}
