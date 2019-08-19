package com.softserve.edu.taskTwoThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class ArraysOfInteger {

	public void arraysSumProduct() {
		int[] numbers = { 1, 4, 18, 3, 6, 12, -5, 2, 7, 13 };
		int sum = 0;
		int product = 1;
		boolean flag = true;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0 && i < numbers.length - 4) {
				flag = false;
			}
		}

		if (flag) {
			for (int i = 0; i < 5; i++) {
				sum += numbers[i];
			}
			System.out.println("Sum = " + sum);

		} else {
			for (int i = 5; i < numbers.length; i++) {
				product *= numbers[i];
			}
			System.out.println("Product = " + product);

		}
	}

	// Task 3

	public void position() {
		int position = 0;
		int index = 0;
		int[] arr = { 1, -5, -4, 3, 11 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && index < 2) {
				position = i;
				index++;
			}
		}

		System.out.println("Position: " + (position + 1) + " place");

	}

	// Min and position
	public void minValue() {
		int[] arr = { 1, -5, -4, 3, -121 };
		int min = arr[0];
		int position = 0;
		int i = 0;

		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
				position = i;
			}
			i++;
		}
		System.out.println(min);
		System.out.print("is " + (position + 1) + " place");
		System.out.println();
	}

//Enter numbers

	public void enterNumber(BufferedReader bf) throws IOException {

		System.out.println("Enter size of array ");
		int size = Integer.parseInt(bf.readLine());
		int[] array = new int[size];
		//System.out.println("Insert array elements ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Insert array elements ");
			int element = Integer.parseInt(bf.readLine());
			array[i] = element;
			if (element > 0) {
				array[i] = element;
			} else
				break;
		}
		System.out.println(" All numbers " + Arrays.toString(array));

		int product = 1;
		for (int i : array) {
			if (i % 2 == 0 && i != 0) {
				product *= i;
			}
		}
		System.out.println(" Product = " + product);

	}
}