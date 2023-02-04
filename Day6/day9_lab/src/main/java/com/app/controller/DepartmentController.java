package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.DepartmentDaoImpl;

@Controller
@RequestMapping
public class DepartmentController {
	@Autowired
	private DepartmentDaoImpl dept;
	
	//URL:http://localhost:8080/day9_lab/
	public DepartmentController() {
		System.out.println("Inside the department Controller" + getClass());
		
	}
	@GetMapping("/")
	public String getAllDepartmentNames(Model map) {
		System.out.println("in get all department method");
		map.addAttribute("department_list",dept.getDeptNames());
		return "/department/dept";//AVN /WEB-INF/views/department/dept.jsp
	}

	

}
