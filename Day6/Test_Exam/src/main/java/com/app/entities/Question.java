package com.app.entities;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="questions")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Question extends BaseEntity{
	
	@Column(name="question_text")
	private String questionText;
	@Column(name="max_marks")
	private int maxMarks;
	@JsonProperty(access = Access.READ_ONLY)
	@ManyToMany(mappedBy = "questions",fetch = FetchType.LAZY)
    private List<Test> tests = new ArrayList<Test>();
	
	
	@OneToMany(mappedBy = "questions",cascade =CascadeType.ALL,  orphanRemoval = true ,fetch = FetchType.EAGER)
	private List<TestCase> testCases = new ArrayList<TestCase>();

	public void addTestCase(TestCase testCase) {
		testCases.add(testCase);
	testCase.setQuestions(this);
	}
	public Question(String questionText, int maxMarks) {
		super();
		this.questionText = questionText;
		this.maxMarks = maxMarks;	
	}
	
}
