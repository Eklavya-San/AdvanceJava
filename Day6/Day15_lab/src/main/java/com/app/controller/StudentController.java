package com.app.controller;

import java.util.List;

import javax.persistence.GeneratedValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Course;
import com.app.entity.Student;
import com.app.service.CourseService;
import com.app.service.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServices stdSe;
	
	@Autowired
	private CourseService couService;
	
	
	public StudentController() {
		System.out.println("inside the ctor"+ getClass());
	}
	
	@GetMapping
	public List<Student> getAllStudent() {
		return stdSe.getAll();
	}
	
	@PostMapping
	public Student addNew(Student std) {
		return stdSe.addNew(std);
	}
	
	@PostMapping("/course")
	public Course addNewCourse(Course c) {
		return couService.addNew(c);
	}

}
