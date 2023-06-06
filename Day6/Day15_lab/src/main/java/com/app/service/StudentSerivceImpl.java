package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Course;
import com.app.entity.Student;
import com.app.repository.StudentRepository;

@Service

public class StudentSerivceImpl implements StudentServices {
@Autowired
	private StudentRepository stdRepo;
	@Override
	public List<Student> getAll() {
		
		return stdRepo.findAll();
	}

	@Override
	public Student addNew(Student newStudent) {
		// TODO Auto-generated method stub
		return stdRepo.save(newStudent);
	}
	@Override
	public Course addNewCourse(Course c) {
		return stdRepo.save(c);
	}

}
