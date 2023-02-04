	package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")//enable CORS header
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	public EmployeeController() {
		System.out.println("int def of "+getClass());
	}
	
	@GetMapping
	public List<Employee> getEmps(){
		System.out.println("in get emps");
		return empService.getAll();
	}
	@PostMapping//URL
	public Employee saveEmp( @RequestBody Employee transientEmp) {
		System.out.println("in save emp "+transientEmp+" id "+transientEmp.getId());
		return empService.addEmpDetails(transientEmp);
	}
	
	
}
