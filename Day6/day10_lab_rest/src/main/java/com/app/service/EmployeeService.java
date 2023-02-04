package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.app.pojos.Employee;



public interface EmployeeService {
	
	List<Employee>getAll();
	Employee addEmpDetails(Employee emp);
	

}
