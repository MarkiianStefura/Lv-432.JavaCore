package ua.ivanskyi.secondTask;

public class Employee {

	private String employeeld;
	private String name;

	public Employee(String employeeld, String name) {
		super();
		this.employeeld = employeeld;
		this.name = name;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeld=" + employeeld + ", name=" + name + "]";
	}

}
