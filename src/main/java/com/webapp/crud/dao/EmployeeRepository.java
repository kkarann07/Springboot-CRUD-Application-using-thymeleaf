package com.webapp.crud.dao;

import java.util.List;

import com.webapp.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();

	// add a method to search by first name and last name
	public List<Employee> findByFirstNameContainsAndLastNameContainsAllIgnoreCase(
									String theFirstName, String theLastName);
	
}
