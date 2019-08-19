package Task_6_2;

public class Student extends Person {
	final String TYPE_PERSON="Student";

	@Override
	public void print() {
		System.out.println(" I'm a "+ TYPE_PERSON);
		
	}

}
