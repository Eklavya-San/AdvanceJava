package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;


@Service
@Transactional//readonly:false
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepository;
	@Override
	public List<Employee> getAll() {
		return empRepository.findAll();
	}
	@Override
	public Employee addEmpDetails(Employee emp) {
		return empRepository.save(emp);
	}
	
}
