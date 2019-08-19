package com.softserve.edu.task_1;

public class NonFlyingBird extends Bird {
	private double speedMove;

	public double getSpeedMove() {
		return speedMove;
	}

	public void setSpeedMove(double speedMove) {
		this.speedMove = speedMove;
	}

	public NonFlyingBird(boolean feathers, boolean layEggs, double speedMove) {
		super(feathers, layEggs);
		this.speedMove = speedMove;

	}

	@Override
	public void fly() {
		System.out.println("We can not fly");

	}

	@Override
	public String toString() {
		return "NonFlyingBird [speedMove=" + speedMove + "km/h " + super.toString();
	}

}
