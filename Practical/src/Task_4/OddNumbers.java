package Task_4;

import java.util.Scanner;

public class OddNumbers {
	private static int count = 0;

	public void input(Scanner scn) {
		System.out.println("Enter first number");
		int i = scn.nextInt();
		System.out.println("Enter second number");
		int j = scn.nextInt();
		System.out.println("Enter third number");
		int k = scn.nextInt();
		System.out.println("You enter 3 numbers " + i + ", " + j + ", " + k);
		if (i % 2 != 0) {
			count++;
		}
		if (j % 2 != 0) {
			count++;
		}

		if (k % 2 != 0) {
			count++;
		}
		System.out.println("Odd numbers is " + count);

	}

}
