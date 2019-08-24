package ua.ivanskyi.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	static void printLongestString(String[] mas) {
		String longestString = mas[0];
		int indexOfSecondWorld = 1;

		for (String x : mas) {

			if (x.length() > longestString.length()) {

				longestString = x;

			}
		}
		System.out.println(longestString);
		System.out.println(longestString.length());
		System.out.println(new StringBuilder(mas[indexOfSecondWorld]).reverse());

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentence");
		String s1 = br.readLine();

		String[] mas = s1.split(" |,");
		Start.printLongestString(mas);

	}

}
