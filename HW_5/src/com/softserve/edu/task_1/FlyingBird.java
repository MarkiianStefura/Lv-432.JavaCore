package com.softserve.edu.task_1;

public class FlyingBird extends Bird {
	private double speedMove;

	public FlyingBird(boolean feathers, boolean layEggs, double speedMove) {
		super(feathers, layEggs);
		this.speedMove = speedMove;

	}

	public double getSpeedMove() {
		return speedMove;
	}

	public void setSpeedMove(double speedMove) {
		this.speedMove = speedMove;
	}

	@Override
	public void fly() {
		System.out.println("We can fly");

	}

	@Override
	public String toString() {
		return "FlyingBird [speedMove=" + speedMove + "km/h " + super.toString();
	}

}
