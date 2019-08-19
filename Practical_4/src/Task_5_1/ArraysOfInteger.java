package Task_5_1;

import java.util.Arrays;

public class ArraysOfInteger {

	public static void main(String[] args) {
		int numbers[] = { 1, -5, 17, -3, 6, -120, 18, 400, 19, -15 };

		// MAX value

		/*
		 * int max=numbers[0];
		 *  for(int i=0;i<numbers.length;i++) {
		 *   if(numbers[i]>max) {
		 * max=numbers[i]; } }
		 *  System.out.println("Max value: " + max);
		 */

		Arrays.sort(numbers);
		int max = numbers[numbers.length - 1];
		System.out.println("Max value: " + max);

		// The sum of positive numbers in array

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				sum += numbers[i];
			}
		}
		System.out.println("Sum of positive numbers: " + sum);

		// The amount of negative numbers
		int amount = 0;
		for (int k : numbers) {
			if (k < 0) {
				amount++;
			}

		}
		System.out.println("Amount of negative numbers:" + amount); 

		// More values
		int more = 0;
		int less = 0;
		for (int k : numbers) {
			if (k > 0) {
				more++;
			} else
				less++;
		}

		System.out.println("We have " + more + " positive numbers, and " + less + " negative numbers");
		if (more > less) {
			System.out.println("More positive ");
		} else
			System.out.println("More negative");

	}
}
