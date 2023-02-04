package com.app.repository;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import com.app.pojos.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
class TestEmployeeRepository {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Test
	void test() {
		assertNotNull(empRepo);
	}
	@Test
	void testAddMultipleEmps() {
		List<Employee> emps = List.of(
				new Employee("Raj", "Patil", "LOlo@gmail.com", "Kolhapur", "12345", "HR",LocalDate.of(2020, 9, 20), (double) 252526));

		
		List<Employee> savedEmps = empRepo.saveAll(emps);
		assertEquals(1,savedEmps.size());
		
	
	}

}
