package PracticalTask6;

public class Teachr extends Staff{
	public static final String TYPE_PERSON = "Teachr";
	
	public Teachr(String name) {
		super(name);		
	}	
	
	@Override
	public String print() {		
		return "I am a ..." + TYPE_PERSON + " " + super.getName();
	}

	@Override
	public double salary() {
		return 200;	
	}

}
