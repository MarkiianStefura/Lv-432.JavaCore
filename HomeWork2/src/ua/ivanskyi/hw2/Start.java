package ua.ivanskyi.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Person p1 = new Person("Ostap", "Ivanskyi");
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();

		p1.input(br);
		p2.input(br);
		p3.input(br);
		p4.input(br);
		p5.input(br);

		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();

	}

}
