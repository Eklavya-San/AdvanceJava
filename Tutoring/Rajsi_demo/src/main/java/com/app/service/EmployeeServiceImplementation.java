package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepostiory;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	private EmployeeRepostiory empRepo;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee addNewEmployee(Employee e) {
		// TODO Auto-generated method stub
		return empRepo.save(e);
	}

	@Override
	public String updateEmployee(Employee e,Long id) {
		// TODO Auto-generated method stub
		if(empRepo.existsById(id)) {
			Employee edited = empRepo.findById(id).orElseThrow();
			edited.setName(e.getName());
			edited.setLocation(e.getLocation());
			empRepo.save(edited);
		}else {
			return "Failed to find this employee";
		}
		
		return "Updated Successfully";
	}

	@Override
	public String deleteEmployee(Long id) {
		
		if(empRepo.existsById(id)) {
			empRepo.deleteById(id);
		}
		else {
			return "Employee not found";
		}
		return "Employee Deleted Successfully";
	}

	

}
