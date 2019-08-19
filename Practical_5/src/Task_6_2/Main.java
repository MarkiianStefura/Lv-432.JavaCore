package Task_6_2;

public class Main {

	public static void main(String[] args) {
		Person[] person = { new Student(), new Teacher(), new Cleaner() };
for (Person person2 : person) {
	person2.print();

	}
Staff[]s= {new Teacher(),new Cleaner()};
for (Staff staff : s) {
	System.out.println(staff.salary());
	
}


	
}
	}


