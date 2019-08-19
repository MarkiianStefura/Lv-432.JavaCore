package edu.softserve.home;

public class SalariedEmployee extends Employee implements Pay {

    private int hourlyPaid;
    private int workTime;
    private String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyPaid() {
        return hourlyPaid;
    }

    public void setHourlyPaid(int hourlyPaid) {
        this.hourlyPaid = hourlyPaid;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }


    SalariedEmployee(int hourlyPaid,int workTime,String employeeId,String socialSecurityNumber){
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyPaid = hourlyPaid;
        this.workTime = workTime;
    }

    @Override
    public int calculatePay() {
        return hourlyPaid*workTime;
    }

    @Override
    public String toString() {
        return super.toString() + " SocialSecurityNumber "+this.socialSecurityNumber
                +" Salary "+ this.calculatePay();
    }
}
