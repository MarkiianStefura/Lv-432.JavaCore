package ua.ivanskyi.firstTask;

public class Eagle extends FlyingBird {

	private String typeOfEagle;

	public Eagle(boolean feathers, boolean layEggs, int flyingSpeed, String typeOfEagle) {
		super(feathers, layEggs, flyingSpeed);
		this.typeOfEagle = typeOfEagle;
	}

	
	
	public String getTypeOfEagle() {
		return typeOfEagle;
	}



	public void setTypeOfEagle(String typeOfEagle) {
		this.typeOfEagle = typeOfEagle;
	}



	@Override
	public void fly() {
		System.out.println("This is the "+typeOfEagle+ " Eagle");

	}

}
