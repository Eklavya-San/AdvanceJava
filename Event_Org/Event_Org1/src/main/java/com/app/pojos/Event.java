package com.app.pojos;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.*;

//@Getter
//@Setter
@Entity
@Table(name="event")
//@ToString
public class Event {
    @Column(name = "event_name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private Long id;
	public Event(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Event() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Event [name=" + name + ", id=" + id + "]";
	}
	

}