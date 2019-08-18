package ua.ivanskyi.firstTask;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("This birds are not flying");

	}

}
