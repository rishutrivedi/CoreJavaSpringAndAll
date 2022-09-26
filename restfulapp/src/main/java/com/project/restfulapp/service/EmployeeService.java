package com.project.restfulapp.service;

import java.util.List;

import com.project.restfulapp.entities.Employee;
import com.project.restfulapp.exceptions.EmployeeNotFoundException;

public interface EmployeeService {

	void deleteEmployee(Long id);

	Employee replaceEmployee(Employee newEmployee, Long id);

	Employee one(Long id) throws EmployeeNotFoundException;

	Employee newEmployee(Employee newEmployee);

	List<Employee> all();

	Employee findByName(String name) throws EmployeeNotFoundException;

}