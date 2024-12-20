package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	//private static String ID = null;
//	Employee employee;
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping
	public List<Employee> getAllEmployee() {
		//return "This is the details of the above employee";
		return employeeService.getAllEmployee();
	}
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		return employeeService.updateEmployee(id, employee);
	}
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		//return"employee Deleted Successfully";
	}
	
	}
	/*
	@PostMapping
	public String createEmployee(@RequestBody Employee employee) {
		this.employee = employee;
		return "Employee created!";
	}
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee employee) {
		this.employee = employee;
		return "Employee updated!";
	}
	
	@DeleteMapping("{ID}")
	public String deleteDetails(Integer ID) {
		this.employee = null;
		return "Employee details deleted successfully";
	}*/
