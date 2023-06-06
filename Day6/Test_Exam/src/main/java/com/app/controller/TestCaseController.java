package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.TestCase;
import com.app.service.TestCaseService;

@RequestMapping("/case")
@RestController
public class TestCaseController {
	
	private TestCaseService testCaseService;
	public TestCaseController() {
		System.out.println("inside test case ");
	}
	
	@GetMapping
	public List<TestCase>getAllCases() {
		return testCaseService.findAllCases();
	}
}
