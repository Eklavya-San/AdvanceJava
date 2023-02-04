package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	public StudentController() {
		System.out.println("in the student controller" + getClass());
	}
	
	
	@GetMapping
	public List<Student> getAllStudents() {
		List<Student> students = List.of(new Student (10,"eklavya","java"),new Student (11,"nova","opps"),new Student (12,"ritz","sdm"));
		return students;
	}

}
