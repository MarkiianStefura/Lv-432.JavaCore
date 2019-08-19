package Task_6_1;

public class Main {

	public static void main(String[] args) {
		Animal[] animal = { new Cat(), new Dog() };
		for (Animal a : animal) {
			a.feed();
			a.voice();

		}
	}

}
