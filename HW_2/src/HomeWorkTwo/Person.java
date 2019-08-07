package HomeWorkTwo;

import java.time.LocalDate;
import java.util.Scanner;

class Person {
	private String firstName;
	private String lastName;
	private int birthYear;

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

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	LocalDate local = LocalDate.now();

	public int getAge() {

		// calDate local = LocalDate.now();
		return local.getYear() - birthYear;
	}

	public void input() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter firstName of Person ");
		firstName = scn.next();
		System.out.println("Enter lastName of Person ");
		lastName = scn.next();
		System.out.println("Enter birthYear of Person ");
		birthYear = scn.nextInt();

	}

	public void output() {
		System.out.println("Person has name " + firstName + " lastName " + lastName + " age " + getAge());
	}

	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}

}
