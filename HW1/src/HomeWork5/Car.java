package HomeWork5;

public class Car {
	private int yearOfProduction;
	private int engineCapacity;	
	
	public Car(int yearOfProduction, int engineCapacity) {		
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
	
	
	@Override
	public String toString() {
		return "Car [yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity + "]";
	}


	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
}
