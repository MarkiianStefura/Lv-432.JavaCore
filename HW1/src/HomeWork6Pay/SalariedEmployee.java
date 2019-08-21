package HomeWork6Pay;

public class SalariedEmployee extends Employee implements Pay {
	

	private double hour;
	private double priseHour;
	private String socialSecurityNumber;
	
	public SalariedEmployee(String employeeld, double hour, double priseHour, String socialSecurityNumber) {
		super(employeeld);
		this.hour = hour;
		this.priseHour = priseHour;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", calculatePay()=" + calculatePay()
				+ "]";
	}






	@Override
	public double calculatePay() {		
		return hour * priseHour;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

}
