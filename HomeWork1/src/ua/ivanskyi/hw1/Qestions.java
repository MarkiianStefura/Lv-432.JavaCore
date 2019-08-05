package ua.ivanskyi.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Qestions {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;
		String address;

		System.out.println("HI! What's your name");

		name = br.readLine();

		System.out.println("Where are you live " + name);

		address = br.readLine();

		System.out.println("Nice to meet you " + name + " from " + address);

	}

}
