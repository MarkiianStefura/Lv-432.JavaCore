package ua.ivanskyi.firstTask;

public class Penguin extends NonFlyingBird {

	public Penguin(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Funny penguin");

	}
}
