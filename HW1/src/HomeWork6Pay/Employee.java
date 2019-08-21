package HomeWork6Pay;

public class Employee {
	private String employeeld;
	

	public Employee(String employeeld) {		
		this.employeeld = employeeld;
	}

	@Override
	public String toString() {
		return "Employee [employeeld=" + employeeld + "]";
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}
}
