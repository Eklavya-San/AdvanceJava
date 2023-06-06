package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
	
	//post mapping add new Employee => create
	Employee addNewEmployee(Employee e); 
	
	//Get mapping find all employees => read 
	List<Employee>getAllEmployees();
	
	//put mapping update employees => update
	String updateEmployee(Employee e,Long id);
	
	//delete mapping delete employee => delete
	String deleteEmployee (Long id);
	
}
