package com.softserve.edu.taskFour;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car[] c = new Car[4];
		c[0] = new Car("Opel", 1989, 1000);
		c[1] = new Car("Mazda", 1999, 2000);
		c[2] = new Car("BMW", 1993, 1900);
		c[3] = new Car("Nissan", 2001, 2400);

		for (Car car : c) {
			System.out.println(car);
		}

		System.out.println("Enter year (1989/1999/1993/2001)");
		int n = Integer.parseInt(sc.next());
		for (Car car : c) {
			if (car.getYearOfProduction() == n) {
				car.setYearOfProduction(n);
				System.out.println(car);

			}
		}
		System.out.println();
		System.out.println("Sorted by Year");
		Car car;
		for (int i = 0; i < c.length; i++) {
			for (int k = i + 1; k < c.length; k++) {
				if (c[i].getYearOfProduction() > c[k].getYearOfProduction()) {

					car = c[i];
					c[i] = c[k];
					c[k] = car;
				}
			}
			System.out.println(c[i]);

		}
	}
}
