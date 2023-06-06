package com.app.service;

import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entities.TestCase;
import com.app.repository.TestCaseRepository;

@Service
@Transactional
public class TestCaseServiceImpl implements TestCaseService {
	
	private TestCaseRepository testCaseRepo;

	@Override
	public List<TestCase> findAllCases() {
		
		return testCaseRepo.findAll();
	}

}
