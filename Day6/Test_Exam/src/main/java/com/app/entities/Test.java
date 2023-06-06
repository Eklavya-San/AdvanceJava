package com.app.entities;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tests")
@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor

public class Test extends BaseEntity{
	@Column (name="test_name")
	private String testName;
	@Column(name="duration_in_minutes")
	private int durationInMinutes;
	@Column(name="start_time")
	private LocalDate examStartDate;
	@Column(name="end_time")
	private LocalDate examEndDate;
	@JsonProperty(access = Access.READ_ONLY)
	@JsonIgnoreProperties("questions")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	    name = "test_questions",
	    joinColumns = @JoinColumn(name = "tests_id"),
	    inverseJoinColumns = @JoinColumn(name = "questions_id")
	)
	private List<Question> questions = new ArrayList<Question>();

	// all args constructor 
	public Test(String testName,int duration, LocalDate startTime, LocalDate endTime) {
		super();
		this.testName = testName;
		this.durationInMinutes=duration;
		this.examStartDate = startTime;
		this.examEndDate = endTime;
	}
	
	//add remove questions =>
	public void addQuestion (Question question) {
		questions.add(question);
		question.getTests().add(this);
	}
	public void removeQuestion (Question question) {
		questions.remove(question);
		question.getTests().remove(this);
	}

	
 
}
