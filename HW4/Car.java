
public class Car {
	String carType;
	int yearOfProduction;
	float engineCapacity;

	public Car(String carType, int yearOfProduction, float engineCapacity) {
		this.carType = carType;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
	public void carInfo() {
		System.out.println("car type is "+carType+", year of prodaction is "+yearOfProduction+", engine capacity is "+engineCapacity);
	}
	public int getYear() {
		return yearOfProduction;
	}
}
