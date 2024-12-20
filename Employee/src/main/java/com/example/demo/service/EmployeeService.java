package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();

	//Employee GetEmployeeById(Long ID);
	Employee createEmployee(Employee employee);
	Employee updateEmployee(Long id, Employee employee);
	void deleteEmployee(Long id);

	Employee getEmployeeById(Long id);

	//Employee getEmployee(int ID);
	
}
