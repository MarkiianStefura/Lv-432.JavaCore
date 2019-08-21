package HomeWork6Pay;

public class ContractEmployee extends Employee implements Pay {
	

	private double fixedPeid;
	private String federalTaxIdmember;
	
	public ContractEmployee(String employeeld, double fixedPeid, String federalTaxIdmember) {
		super(employeeld);
		this.fixedPeid = fixedPeid;
		this.federalTaxIdmember = federalTaxIdmember;
	}
	
	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", calculatePay()=" + calculatePay()
				+ "]";
	}

	@Override
	public double calculatePay() {		
		return fixedPeid;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

}
