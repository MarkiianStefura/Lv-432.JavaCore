package PracticalTask3;

public class Main {

	public static void main(String[] args) {
		Employee person1 = new Employee();
		person1.setName("Vova");
		person1.setRate(5);
		person1.setHours(8);
		
		Employee person2 = new Employee("Givi", 8);
		person2.setHours(10);
		
		Employee person3 = new Employee("Roma", 9, 12);
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println("Summa :" +Employee.getTotalSum());
		person1.setRate(10);
		System.out.println(person1);

		System.out.println("Summa :" +Employee.getTotalSum());

	}

}
