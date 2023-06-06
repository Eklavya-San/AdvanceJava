package com.app.pojos;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="emp")
@Getter
@Setter
@NoArgsConstructor
public class Employee {
	
	public Employee(Long id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private Long id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_location")
	private String location;

}
