package HomeWork3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	Calendar calendar = new GregorianCalendar();
	public Person(){}
	
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAge(int birthYear) {		
		return calendar.getWeekYear() - birthYear;		
	}
	
	public void input(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public String output() {
		if (birthYear==0) {
			return "First name : "+firstName+ ". Last name : "+lastName+ ". Age: not known ";
		}
		return "First name : "+firstName+ ". Last name : "+lastName+ ". Age: "+getAge(birthYear);		
	}
	
	public void changeName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
