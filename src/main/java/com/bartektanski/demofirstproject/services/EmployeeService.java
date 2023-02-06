package com.bartektanski.demofirstproject.services;

import java.util.List;

import com.bartektanski.demofirstproject.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

		
}
