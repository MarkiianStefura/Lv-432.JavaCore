package HomeWorkTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();

		p1.input(scn);
		p2.input(scn);
		p3.input(scn);
		p4.input(scn);
		p5.input(scn);

		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();

	}

}
