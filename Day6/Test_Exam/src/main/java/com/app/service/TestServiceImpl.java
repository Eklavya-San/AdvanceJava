package com.app.service;

import java.util.List;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.Test;
import com.app.respository.TestRepository;

@Service
@Transactional
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestRepository testRepo;
	
	@Override
	public Test addTest(Test trasientTest) {
		System.out.println(trasientTest);
		return testRepo.save(trasientTest);
	}
	private final TestRepository testRepository;

	    @Autowired
	    public TestServiceImpl(TestRepository testRepository) {
	        this.testRepository = testRepository;
	    }

	    @Override
	    public List<Test> getAllTests() {
	        return testRepository.findAll();
	    }

	    @Override
	    public Test getTestById(Long id) {
	        return testRepository.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("Test not found with id: " + id));
	    }

	    @Override
	    public Test createTest(Test test) {
	        return testRepository.save(test);
	    }

	    @Override
	    public Test updateTest(Long id, Test test) {
	        Test existingTest = testRepository.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("Test not found with id: " + id));
	        existingTest.setTestName(test.getTestName());
	        existingTest.setDurationInMinutes(test.getDurationInMinutes());
	        existingTest.setExamStartDate(test.getExamStartDate());
	        existingTest.setExamEndDate(test.getExamEndDate());
	        existingTest.setQuestions(test.getQuestions());
	        return testRepository.save(existingTest);
	    }

	    @Override
	    public void deleteTest(Long id) {
	        Test test = testRepository.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("Test not found with id: " + id));
	        testRepository.delete(test);
	    }
	


}
