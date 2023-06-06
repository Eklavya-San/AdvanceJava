package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Course;
import com.app.repository.CourseRepo;
@Service
public class CourseServiceImp implements CourseService {

	@Autowired
	private CourseRepo crepo;
	@Override
	public Course addNew(Course c) {
		// TODO Auto-generated method stub
		return crepo.save(c);
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

}
