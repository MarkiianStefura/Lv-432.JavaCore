package com.softserve.edu.task_2;

public class ContractEmployee extends Employee implements Calculate {

	private String federalTaxIdmember;
	private double fixedMonthlyPayment;

	public ContractEmployee(String name, String employeeId, double fixedMonthlyPayment,String federalTaxIdmember) {
		super(name, employeeId);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		this.federalTaxIdmember=federalTaxIdmember;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public double calculatePay() {
		return fixedMonthlyPayment;

	}

	@Override
	public String toString() {
		return  super.toString()+  ", calculatePay()=" + calculatePay();
	}
	

}
