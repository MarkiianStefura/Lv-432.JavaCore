package PracticalTask6;

public class Student extends Person {
	public static final String TYPE_PERSON = "Student";
	
	public Student(String name) {
		super(name);		
	}

	@Override
	public String print() {		
		return "I am a..."+TYPE_PERSON+" "+  super.getName();
	}

}
