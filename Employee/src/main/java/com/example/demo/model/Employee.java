package com.example.demo.model;

public class Employee {
	private Long id;
	private String name;
	private Long salary;
	public Employee(Long id, String name, Long salary) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		//super();
	}
	public Long getID() {
		return id;
	}
	public void setID(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public static Object stream() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
