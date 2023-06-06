package com.app.service;

import java.util.List;

import com.app.entities.Question;

public interface QuestionService {
	List<Question> getAllQues();

	Question getQuestionById(Long id);

	Question createQuestion(Question question);

   Question updateQuestion(Long id, Question question);

	void deleteQuestion(Long id);
}
