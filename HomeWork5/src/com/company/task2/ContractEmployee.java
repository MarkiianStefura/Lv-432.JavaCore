package com.company.task2;

public class ContractEmployee extends Employee implements Salary {
    private double hours;
    private double rate;
    private int federalTaxIdNumber;

    @Override
    public double calculatePay() {
        return hours * rate;
    }

    public ContractEmployee(String employeeID, double hours, double rate, int federalTaxIdNumber) {
        super(employeeID);
        this.hours = hours;
        this.rate = rate;
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "hours=" + hours +
                ", rate=" + rate +
                ", federalTaxIdNumber= " + federalTaxIdNumber + " Salary =" + calculatePay() +
                "} " + super.toString();
    }
}
