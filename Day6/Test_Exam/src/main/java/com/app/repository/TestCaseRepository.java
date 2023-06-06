package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.TestCase;

public interface TestCaseRepository extends JpaRepository<TestCase, Long>{

}
