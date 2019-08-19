package Task_6_2;

public class Teacher extends Staff{
	private int days=25;
	private double salaryForDay=130;
	final String TYPE_PERSON="Teacher";
	

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getSalaryForDay() {
		return salaryForDay;
	}

	public void setSalaryForDay(double salaryForDay) {
		this.salaryForDay = salaryForDay;
	}

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
