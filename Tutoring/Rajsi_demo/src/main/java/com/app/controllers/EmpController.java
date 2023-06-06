package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmpController {
	
	@Autowired 
	private EmployeeService empServer;
	
	public EmpController() {
		
	}
	@GetMapping("/welcomePage")
	public String welcomePage() {
		return "welcome to new Project";
	}
	@GetMapping("/find")
	public List<Employee>findAllEmployees(){
		return empServer.getAllEmployees();
	}
	@PostMapping("/save")
	public Employee createNewEmployee(@RequestBody Employee e) {
		return empServer.addNewEmployee(e);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable Long id) {
		return empServer.deleteEmployee(id);
	}
	@PutMapping("/update/{id}")
	public String updateEmployeeDetails(@RequestBody Employee e, @PathVariable Long id) {
		return empServer.updateEmployee(e, id);
	}
}
