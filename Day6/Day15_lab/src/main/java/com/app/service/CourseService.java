package com.app.service;

import java.util.List;

import com.app.entity.Course;

public interface CourseService {
	
	Course addNew(Course c);
	List<Course> getAll();
}
