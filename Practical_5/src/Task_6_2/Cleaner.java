package Task_6_2;

public class Cleaner extends Staff {
	private int days=30;
	private double salaryForDay=100;
	final String TYPE_PERSON="Cleaner";
	
	
	@Override
	public double salary() {
		System.out.print("Salery of " + TYPE_PERSON+ " ");
		return days* salaryForDay;
	
	}

	@Override
	public void print() {
		System.out.println(" I'm a "+ TYPE_PERSON);
		
	}

}
