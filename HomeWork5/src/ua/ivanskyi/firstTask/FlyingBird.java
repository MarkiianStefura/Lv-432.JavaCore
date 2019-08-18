package ua.ivanskyi.firstTask;

public class FlyingBird extends Bird {

	private int flyingSpeed;

	public FlyingBird(boolean feathers, boolean layEggs, int flyingSpeed) {
		super(feathers, layEggs);
		this.flyingSpeed = flyingSpeed;
	}

	public int getFlyingSpeed() {
		return flyingSpeed;
	}

	public void setFlyingSpeed(int flyingSpeed) {
		this.flyingSpeed = flyingSpeed;
	}

	@Override
	public void fly() {
		System.out.println("This birds are flying");

	}

}
