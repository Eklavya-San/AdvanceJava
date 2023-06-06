package com.app.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.TestCase;

public interface TestCaseService  {
	List<TestCase> findAllCases();
}
