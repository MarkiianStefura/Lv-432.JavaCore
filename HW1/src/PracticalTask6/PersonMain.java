package PracticalTask6;

public class PersonMain {

	public static void main(String[] args) {
		Person[] persons = {new Student("V"), new Teachr("B"), new Cleaner("C"), new Student("P")};
		for (Person person : persons) {
			System.out.println(person.print());
			
		}
		Staff[] persons2 = {new Teachr("Sara"), new Cleaner("Pon")};
		for (Staff staff : persons2) {
			System.out.println(staff.print()+ " salary = "+staff.salary());
		}
	}

}
