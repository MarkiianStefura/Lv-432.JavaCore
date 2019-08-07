package ua.ivanskyi.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {

	public static int count = 0;

	private int personNumber;
	private String firstName;
	private String lastName;
	private int birthYear;

	public Person() {
		count++;
		personNumber = count;
	}

	public Person(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		count++;
		personNumber = count;
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getAge() {

		if (birthYear == 0)
			return 0;
		else
			return LocalDate.now().getYear() - birthYear;
	}

	public void changeName(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

	}

	/*
	 * public void input(BufferedReader br) throws IOException {
	 * System.out.println("Enter First Name"); firstName = br.readLine();
	 * System.out.println("Enter Last Name"); lastName = br.readLine();
	 * System.out.println("Enter Birth Year"); birthYear =
	 * Integer.parseInt(br.readLine());
	 * 
	 * }
	 */
	public void input(BufferedReader br) throws IOException {

		output();
		System.out.print("1.Input First Name\n2.Input last name\n3.Input Birth Year\n9.Exit\n");

		switch (Integer.parseInt(br.readLine())) {

		case 1:
			System.out.println("Enter First Name");

			firstName = br.readLine();
			input(br);
			break;

		case 2:
			System.out.println("Enter Last Name");
			lastName = br.readLine();
			input(br);
			break;
		case 3:
			System.out.println("Enter Birth Year");
			birthYear = Integer.parseInt(br.readLine());
			input(br);
			break;
		case 9:
			break;
		default:
			input(br);
			break;
		}

	}

	public void output() {
		System.out.println("Person" + " Number- " + personNumber + "( firstName=" + firstName + ", lastName=" + lastName
				+ ", birthYear=" + birthYear + " fullYears=" + getAge() + ")");

	}

}
