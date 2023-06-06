package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="emps")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee extends BaseEntity {
	
	@Column (name="first_name", length = 20)
	private String firstName;
	@Column (name="last_name", length = 20)
	private String lastName;
	@Column (name="location", length = 20)
	private String location;
	@Column(name="email", unique = true, length = 30)
	private String email;
	public Employee(String firstName, String lastName, String location, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.email = email;
	}

	
}
