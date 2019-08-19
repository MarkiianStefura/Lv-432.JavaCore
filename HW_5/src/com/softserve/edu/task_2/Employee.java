package com.softserve.edu.task_2;

public class Employee {
	private String name;
	private String employeeId;

	public Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", employeeId=" + employeeId;
	}
	

}
