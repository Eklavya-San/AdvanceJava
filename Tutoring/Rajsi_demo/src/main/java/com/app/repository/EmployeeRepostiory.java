package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Employee;

public interface EmployeeRepostiory extends JpaRepository<Employee, Long> {

}
