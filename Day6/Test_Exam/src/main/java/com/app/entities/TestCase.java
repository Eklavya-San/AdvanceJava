package com.app.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="test_cases")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class TestCase extends BaseEntity {

	@Column(name="marks")
	private int marks;
	
	@Column(name="solution")
	private String solution;
	
	@ManyToOne
	@JoinColumn (name="questions_id")
	private Question questions;

	public TestCase(int marks, String solution) {
		super();
		this.marks = marks;
		this.solution = solution;
	}

}
