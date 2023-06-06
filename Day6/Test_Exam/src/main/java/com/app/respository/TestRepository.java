package com.app.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Test;

public interface TestRepository extends JpaRepository<Test, Long>{
	

	
	

}
