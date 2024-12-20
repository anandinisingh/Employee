package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	private final List<Employee> employees = new ArrayList<>();
	private Long id=1L;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return employees;
	}
	@Override
	public Employee getEmployeeById(Long id) {
		
		
		return employees.stream()
				.filter(employee -> employee.getID()
				.equals(id))
				.findFirst()
				.orElse(null);
	}
	@Override
	public Employee createEmployee(Employee employee) {
		//Long next;
		employee.setID( id++);
		employees.add(employee);
		return employee;
	}
	
	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		for(Employee existingEmployee: employees) {
			if (existingEmployee.getID().equals(id)) {
				existingEmployee.setName(employee.getName());
				existingEmployee.setSalary(employee.getSalary());
				return existingEmployee;
			}
		}
		return null;
	}
	@Override
	public void  deleteEmployee(Long id) {
		employees.removeIf(employee-> employee.getID().equals(id));
		
	}
	
		
}

	


