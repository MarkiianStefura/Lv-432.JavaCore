package ua.ivanskyi.threeTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Start {

	static void findMonth(BufferedReader br) throws NumberFormatException, IOException {

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int number = 0;

		System.out.println("Enter number of month plz");
		number = Integer.parseInt(br.readLine()) - 1;

		System.out.println("There are " + days[number] + " days");

	}

	static void sumOrProduct() {
		int[] days = { 5, 3, 1, 8, 2, 9, 11, 1, 3, 4 };
		boolean check = true;
		int sum = 0;
		int product = 1;

		for (int x : days) {
			if (x < 0) {
				check = false;  // break далі
			}
		}

		if (check) {
			for (int z = 0; z < days.length / 2; z++) {
				sum += days[z];

			}
			System.out.println("sum = " + sum);
		} else {
			for (int z = days.length - 1; z >= days.length / 2; z--) {
				product *= days[z];

			}
			System.out.println("product = " + product);

		}

	}

	static void positionAndMin() {
		int[] days = { -5, 3, -1, 8, -21 };

		int counter = 0;
		int indexOfSecondPositive = 0;
		int secondPositive = 0;

		int min = days[0];
		int indexMin = 0;

		int i = 0;

		while (i < days.length && counter < 2) {
			if (days[i] >= 0) {

				indexOfSecondPositive = i;
				secondPositive = days[i];
				counter++;

			}

			i++;

		}
		while (i < days.length) {
			if (days[i] < min) {
				min = days[i];
				indexMin = i;

			}
			i++;

		}

		System.out.println("Index of second positive number = " + indexOfSecondPositive);
		System.out.println("Second positive number = " + secondPositive);
		System.out.println("MInimum number = " + min);
		System.out.println("Minimum number index = " + indexMin);

	}

	static void enterAndCount(BufferedReader br) throws NumberFormatException, IOException {

		int[] mas = new int[10];
		int index = 0;
		int product = 1;
		int entered = 0;

		while (index < mas.length) {
			System.out.println("Enter number");
			entered = Integer.parseInt(br.readLine());
			if (entered > 0) {
				mas[index] = entered;
				index++;

			} else {
				break;
			}

		}
		for (int z : mas) {
			if (z % 2 == 0 && z != 0)
				product *= z;
		}
		System.out.println(Arrays.toString(mas));
		System.out.println(product);

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Start.findMonth(br);
		// Start.sumOrProduct();
		// Start.positionAndMin();
		Start.enterAndCount(br);
	}

}
