package ua.ivanskyi.secondTask;

public class ContractEmployee extends Employee implements Calculate {

	private String federalTaxIdmember;
	private int hourlyRate;
	private int workedHours;

	public ContractEmployee(String employeeld, String name, String federalTaxIdmember, int hourlyRate,
			int workedHours) {
		super(employeeld, name);
		this.federalTaxIdmember = federalTaxIdmember.toUpperCase();
		this.hourlyRate = hourlyRate;
		this.workedHours = workedHours;
	}

	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return hourlyRate * workedHours;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", Employeeld=" + super.getEmployeeld()
				+ ", name=" + super.getName() + ", salary" + calculatePay() + " ]";
	}

}
