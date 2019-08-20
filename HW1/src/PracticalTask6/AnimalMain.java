package PracticalTask6;

public class AnimalMain {

	public static void main(String[] args) {
		Animal[] animals  = new Animal[6]; 
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Dog();
		animals[3] = new Cat();
		animals[4] = new Cat();
		animals[5] = new Dog();
		for (Animal animal : animals) {
			System.out.println(animal.voice() + " "+ animal.feed());
		}
	}

}
