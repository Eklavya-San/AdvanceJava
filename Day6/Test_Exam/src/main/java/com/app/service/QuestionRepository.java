package com.app.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Question;
import com.app.entities.Test;

public interface QuestionRepository extends JpaRepository<Question,Long> {
	


}
