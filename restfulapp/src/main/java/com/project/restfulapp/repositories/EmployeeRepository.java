package com.project.restfulapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.restfulapp.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Employee findByName(String name) ;
}