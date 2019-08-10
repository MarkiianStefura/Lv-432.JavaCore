package Task_2;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog("Riko", Breed.SHARPEY, 7);
		Dog d2 = new Dog("Oskar", Breed.GERMAN_SHEPHERD, 2);
		Dog d3 = new Dog("Rufus", Breed.HUSKIES, 4);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(Dog.equalsNames(d1, d2, d3));
		Dog.oldestDog(d1, d2, d3);

	}

}
