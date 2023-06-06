package com.app.service;

import java.util.List;

import com.app.entities.Test;

public interface TestService {
	
	List<Test>getAllTests();

	Test addTest(Test trasientTest);
	
	
    Test getTestById(Long id);
    Test createTest(Test test);
    Test updateTest(Long id, Test test);
    void deleteTest(Long id);
}
