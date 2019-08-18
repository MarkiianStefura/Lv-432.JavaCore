package com.company.task2;

public class SalaryEmployee extends Employee implements Salary{

    private double fixedPaid;
    private double socialSecurityNumber;

    @Override
    public double calculatePay() {
        return fixedPaid;
    }

    public SalaryEmployee(String employeeID, double fixedPaid, double socialSecurityNumber) {
        super(employeeID);
        this.fixedPaid = fixedPaid;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "fixedPaid=" + fixedPaid +
                ", socialSecurityNumber=" + socialSecurityNumber + " Salary =" + calculatePay() +
                "} " + super.toString();
    }
}
