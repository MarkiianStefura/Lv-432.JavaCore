package edu.softserve.home;

public class ContractEmployee extends Employee implements Pay {
    private int fixedPayed;
    private String federalTaxIdMember;

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getFixedPayed() {
        return fixedPayed;
    }

    public void setFixedPayed(int fixedPayed) {
        this.fixedPayed = fixedPayed;
    }

    ContractEmployee(int fixedPayed,String employeeId,String federalTaxIdMember){
        super(employeeId);
        this.fixedPayed = fixedPayed;
        this.federalTaxIdMember =federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return fixedPayed;
    }
    @Override
    public String toString() {
        return super.toString() + " FederalTaxIdMember "+this.federalTaxIdMember
                +" Salary "+ this.calculatePay();
    }
}
