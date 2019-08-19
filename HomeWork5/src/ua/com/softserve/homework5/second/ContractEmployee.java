package ua.com.softserve.homework5.second;

public class ContractEmployee extends Employee implements SalaryCount {

    private int hourlyRate;
    private int workHours;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, int hourlyRate, int workHours, String federalTaxIdMember) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;

    }

    @Override
    public String toString() {

        return "ContractEmployee{" +
                "hourlyRate= " + hourlyRate +
                ", workHours= " + workHours +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                "}" + " " + super.toString();
    }

    @Override
    public int calculatePay() {
        return hourlyRate*workHours ;
    }
}

