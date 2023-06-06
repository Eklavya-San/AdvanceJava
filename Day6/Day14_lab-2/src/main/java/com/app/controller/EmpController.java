package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emps")
public class EmpController {
	
	public EmpController() {
		System.out.println("in side the constructor emp");
	}
	
	
}
