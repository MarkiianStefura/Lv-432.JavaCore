package ua.ivanskyi.fourthTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Start {

	static void sort(Car[] mas) {

		Car tmp;
		for (int x = 0; x < mas.length - 1; x++) {
			for (int z = x + 1; z < mas.length; z++) {
				if (mas[x].getYearOfProduction() > mas[z].getYearOfProduction()) {

					tmp = mas[x];
					mas[x] = mas[z];
					mas[z] = tmp;

				}

			}

		}

	}

	static void findCar(BufferedReader br, Car[] mas) throws NumberFormatException, IOException {

		System.out.println("Enter year");
		int eYear = Integer.parseInt(br.readLine());

		for (Car c : mas) {
			if (c.getYearOfProduction() == eYear) {

				System.out.println("Your car is " + c.toString());
			}
		}

	}

	static void print(Car[] mas) {

		for (Car c : mas) {
			System.out.println(c.toString());
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Car c1 = new Car("fiat", 2012, 1300);
		Car c2 = new Car("renault", 2016, 1500);
		Car c3 = new Car("toyota", 1998, 2400);
		Car c4 = new Car("mazda", 2005, 2000);

		Car[] mas = { c1, c2, c3, c4 };

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Start.findCar(br, mas);
		Start.sort(mas);
		Start.print(mas);
	}

}
