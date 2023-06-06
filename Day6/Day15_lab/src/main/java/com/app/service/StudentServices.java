package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface StudentServices {
	
	List<Student>getAll() ;
	Student addNew(Student newStudent);


}
