package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//<tr key={employee.id}>
//<td>{employee.firstName}</td>
//<td>{employee.lastName}</td>
//<td>{employee.email}</td>
//<td>{employee.workLocation}</td>
//<td>{employee.department}</td>
//<td>{employee.joinDate}</td>
//<td>{employee.salary}</td>
//<td>

@Entity
@Table(name = "new_emps")
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper=true,exclude="password")
public class Employee extends BaseEntity{

@Column (length = 20)
	private String firstName;
@Column (length = 20)
	private String lastName;
@Column (length = 50 ,unique = true)
	private String email;
@Column (length = 50 ,nullable = false)
private String password;
@Column (length = 20)
	private String location;
@Column (length = 20)
	private String department;
	private LocalDate joinDate;
	private Double salary;
	
	public Employee(String firstName, String lastName, String email, String password, String location,
			String department, LocalDate joinDate, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.location = location;
		this.department = department;
		this.joinDate = joinDate;
		this.salary = salary;
	}
}
