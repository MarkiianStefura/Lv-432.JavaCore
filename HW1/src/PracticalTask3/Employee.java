package PracticalTask3;

public class Employee {
	private String name;
	private double rate;
	private double hours;
	private static double totalSum;
	

	public Employee(){}

	public Employee(String name, double rate){
		this.name = name;
		this.rate = rate;		
	}

	public Employee(String name, double rate, double hours){
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum +getSalary()+getBonuses();
	}

	public double getSalary() {			
		return rate*hours;		
	}
	
	@Override
	public String toString(){
		return "Name :"+name+" rate :"+rate+" hours :" +hours+" salery :"+String.valueOf(getSalary()) + " bonus :"+String.valueOf(getBonuses());		
	}
	
	public double changeRate(double rate) {			
		this.rate = rate;
		return rate*hours;		
	}
	
	public double getBonuses(){		
		return getSalary()*0.1;		
	}
	
	public String getName() {
		return name;
	}
	public double getRate() {
		return rate;
	}
	public double getHours() {
		return hours;
	}
	public static double getTotalSum() {
		return totalSum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRate(double rate) {		
		//totalSum = totalSum -getSalary()-getBonuses();

		this.rate = rate;
		totalSum = totalSum +getSalary()+getBonuses();

	}
	public void setHours(double hours) {		
		this.hours = hours;
		totalSum = totalSum +getSalary()+getBonuses();

	}
	public static void setTotalSum(double totalSum) {
		Employee.totalSum = totalSum;
	}

}
