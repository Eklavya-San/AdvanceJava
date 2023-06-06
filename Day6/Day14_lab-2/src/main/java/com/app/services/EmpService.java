package com.app.services;

import java.util.List;

import com.app.entities.Employee;


public interface EmpService {
	List<Employee>getAll();
	Employee fetchDetails(Long id);
	Employee updateDetails(Employee e1);
	Employee addEmp(Employee e1);
	String deleteEmp(Long id);
	
}
