package com.softserve.edu.task_1;

public class Penguin extends NonFlyingBird {
	private String type;

	public Penguin(boolean feathers, boolean layEggs, double speedMove, String type) {
		super(feathers, layEggs, speedMove);
		this.type = type;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return " [type=" + type + "]";
	}

}
