package edu.softserve.home;

public class Employee {
    private String employeeId;

    Employee(String employeeId){
        this.employeeId=employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString(){
        return "EmployeeId "+employeeId;
    }
}
