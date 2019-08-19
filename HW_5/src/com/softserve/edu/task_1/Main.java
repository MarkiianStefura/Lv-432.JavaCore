package com.softserve.edu.task_1;

public class Main {

	public static void main(String[] args) {
		Bird[] bird = { new Eagle(true, true, 120, "Eagle"),
				new Swallow(true, true, 40, "Swallow"),
				new Penguin(true, true, 6.5, "Penguin"), 
				new Chicken(true, true, 7.6, "Chicken") };
		for (Bird b : bird) {
			System.out.println(b);
			b.fly();
		}
		Bird[] b = { new FlyingBird(true, true, 60), new NonFlyingBird(true, true, 7) };
		for (Bird bird2 : b) {
			System.out.println(bird2);
		}

	}

}
