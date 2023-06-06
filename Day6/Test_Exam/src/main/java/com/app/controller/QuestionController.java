package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Question;
import com.app.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@GetMapping
	public List<Question> getAllQuestions() {
		return questionService.getAllQues();
	}
	
	@PostMapping
	public Question addNewQuestion(@RequestBody Question transientQuestion) {
		System.out.println(transientQuestion);
		return questionService.createQuestion(transientQuestion);
	}
	
	@DeleteMapping
	public void deleteQuestion(Long id) {
		questionService.deleteQuestion(id);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <Question>getQuestionById(@PathVariable Long id){
		Question question = questionService.getQuestionById(id);
		return new ResponseEntity<Question>(question,HttpStatus.OK
				);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Question>updateQuestion (@PathVariable Long id, @RequestBody Question question){
		Question updatedQuestion = questionService.updateQuestion(id, question);
		return new ResponseEntity<Question>(updatedQuestion , HttpStatus.OK);
	}
	
}
