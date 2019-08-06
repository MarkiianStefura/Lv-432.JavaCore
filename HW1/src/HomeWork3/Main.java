package HomeWork3;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.input("Vova", "Vovikov", 1976);
		System.out.println(person1.output());
		person1.changeName("Roma", "Petrov");
		System.out.println(person1.output());
		
		Person person2 = new Person("Petro", "Duda");
		System.out.println(person2.output());
		person2.setBirthYear(2000);
		System.out.println(person2.output());
		
		Person person3 = new Person("Slon", "Hobit");
		System.out.println(person3.output());
		person3.changeName("Potap", "Reymon");
		person3.setBirthYear(1990);
		System.out.println(person3.output());
		
		Person person4 = new Person();
		person4.setFirstName("Sasha");
		person4.setLastName("Kovalyk");
		person4.setBirthYear(1999);
		System.out.println(person4.output());
	}

}
