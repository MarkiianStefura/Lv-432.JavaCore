package Task_4;

import java.util.Scanner;

public class EnumClass {
	Continent continent;

	public void inputCountry(Scanner scn) {

		System.out.println("Enter name of country ");
		String countryName = scn.next().toUpperCase();
		switch (countryName) {
		case "UKRAINE":
		case "POLAND":
		case "ROMANIA":
			System.out.println("It's " + Continent.EUROPA);
			break;

		case "NIGERIA":
		case "EGYPT":
		case "TANZANIA":
			System.out.println("It's " + Continent.AFRICA);
			break;

		case "CHINA":
		case "INDIA":
		case "JAPAN":
			System.out.println("It's " + Continent.ASIA);
			break;
		default:
			System.out.println("This country does not include in our list. Please, try again");
		}

	}
}
