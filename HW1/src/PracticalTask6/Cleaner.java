package PracticalTask6;

public class Cleaner extends Staff{
	public static final String TYPE_PERSON = "Cleaner";
	
	public Cleaner(String name) {
		super(name);
		
	}	
	@Override
	public String print() {		
		return "I am a ..." + TYPE_PERSON + " " + super.getName();
	}

	@Override
	public double salary() {		
		return 100;
	}

	

}
