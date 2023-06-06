package com.app.Controller ;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Event;
import com.app.service.EventService;

@RestController
@CrossOrigin
@RequestMapping("/event")
public class EventController {
	@Autowired
	 EventService service;
	public EventController() {
		System.out.println("Inside the event controller");
	}
	@GetMapping("/all")
	public List<Event> findAllEvents() {
		return service.findAllEvents();
	}
}
