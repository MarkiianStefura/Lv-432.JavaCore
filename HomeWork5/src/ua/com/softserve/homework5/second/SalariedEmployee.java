package ua.com.softserve.homework5.second;

public class SalariedEmployee extends Employee implements SalaryCount {

    private int fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, int fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "fixedMonthlyPayment= " + fixedMonthlyPayment +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                "} " + " " + super.toString();
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
}

