package com.company.task2;

public class Employee implements Salary {

    private String employeeID;

    @Override
    public double calculatePay() {
        return 0;
    }

    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' + " Salary =" + calculatePay() +
                '}';
    }
}
