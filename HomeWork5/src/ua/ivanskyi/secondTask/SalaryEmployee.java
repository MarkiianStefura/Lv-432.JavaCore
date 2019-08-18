package ua.ivanskyi.secondTask;

public class SalaryEmployee extends Employee implements Calculate {

	private String socialSecurityNumber;

	private int fixedSalary;

	public SalaryEmployee(String employeeld, String name, String socialSecurityNumber, int fixedSalary) {
		super(employeeld, name);
		this.socialSecurityNumber = socialSecurityNumber.toUpperCase();
		this.fixedSalary = fixedSalary;
	}

	@Override
	public int calculatePay() {
		return fixedSalary;

	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	@Override
	public String toString() {
		return "SalaryEmployee [socialSecurityNumber=" + socialSecurityNumber + ", Employeeld=" + super.getEmployeeld()
				+ ", name=" + super.getName() + ", fixedSalary=" + fixedSalary + "]";
	}

}
