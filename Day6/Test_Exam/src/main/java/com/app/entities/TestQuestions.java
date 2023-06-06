package com.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class TestQuestions  implements Serializable {
	


	@Column(name="test_id")
	private long testId;
	@Column(name="question_id")
	private long questionId;
	
	
	public TestQuestions(long testId, long questionId) {
		super();
		this.testId = testId;
		this.questionId = questionId;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	
	
}
