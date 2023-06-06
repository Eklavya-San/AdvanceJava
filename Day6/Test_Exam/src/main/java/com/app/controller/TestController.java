package com.app.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Test;
import com.app.service.TestService;


@RestController
public class TestController {
	@Autowired
	private TestService testService;
	

	   @Autowired
	    public TestController(TestService testService) {
	        this.testService = testService;
	    }
	   @GetMapping
	    public ResponseEntity<List<Test>> getAllTests() {
	    	System.out.println("inside get all");
		   List<Test> tests = testService.getAllTests();
	        return ResponseEntity.ok(tests);
	    }
//	
//	@PostMapping
//	
//	public Test addTest(@RequestBody Test newTest) {
//		System.out.println("inside save all tests");
//		return testService.addTest(newTest);
//	}
	
	   @GetMapping("/{id}")
	    public ResponseEntity<Test> getTestById(@PathVariable Long id) {
	    	System.out.println("inside get");
		   Test test = testService.getTestById(id);
	        return new ResponseEntity<>(test, HttpStatus.OK);
	    }

	    @PostMapping
	    public ResponseEntity<Test> createTest(@RequestBody Test test) {
	    	System.out.println("inside create");
	    	Test createdTest = testService.createTest(test);
	        return new ResponseEntity<>(createdTest, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Test> updateTest(@PathVariable Long id, @RequestBody Test test) {
	    	System.out.println("inside update");
	    	Test updatedTest = testService.updateTest(id, test);
	        return new ResponseEntity<>(updatedTest, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteTest(@PathVariable Long id) {
	    	System.out.println("inside delete");
	        testService.deleteTest(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
}
