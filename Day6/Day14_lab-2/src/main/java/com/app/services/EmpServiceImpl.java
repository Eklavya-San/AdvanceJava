package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entities.Employee;
import com.app.repository.EmpRepository;
@Service
public class EmpServiceImpl implements EmpService {
	private EmpRepository empRepo;

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return  empRepo.findAll();
	}

	@Override
	public Employee fetchDetails(Long id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Employee updateDetails(Employee e1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmp(Employee e1) {
		// TODO Auto-generated method stub
		return empRepo.save(e1);
	}

	@Override
	public String deleteEmp(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
