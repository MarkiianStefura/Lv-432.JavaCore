package ua.ivanskyi.firstTask;

public abstract class Bird {

	public boolean feathers;
	public boolean layEggs;

	public Bird(boolean feathers, boolean layEggs) {
		super();
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public abstract void fly();;
}
