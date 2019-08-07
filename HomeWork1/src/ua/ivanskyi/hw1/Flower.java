package ua.ivanskyi.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flower {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int radius;
		double perimeter;
		double area;
		double pi = 3.14;

		System.out.println("Enter radius");

		radius = Integer.parseInt(br.readLine());

		perimeter = 2 * pi * radius;
		area = pi * Math.pow(radius, 2);

		System.out.println("Flower's perimeter = " + perimeter + "\nFlower's area = " + area);
	}

}
