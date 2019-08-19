package com.softserve.edu.task_2;

public class SalariedEmployee extends Employee implements Calculate {
	private String socialSecurityNumber;
	private double hourlyRate;
	private int numberOfHoursWorked;

	public SalariedEmployee(String name, String employeeId, double hourlyRate, int numberOfHoursWorked,
			String socialSecurityNumber) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * numberOfHoursWorked;

	}

	@Override
	public String toString() {
		return  super.toString()+" , calculatePay()= " + calculatePay();
	}

}
