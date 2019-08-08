package ua.ivanskyi.secondAndThirdTask;

public class Start {

	static Dog oldestDog(Dog... dogs) {

		Dog oldestDog = null;
		int age = 0;

		for (int x = 0; x < dogs.length; x++) {
			if (dogs[x].getAge() > age) {

				age = dogs[x].getAge();
				oldestDog = dogs[x];

			}

		}

		return oldestDog;

	}

	public static void main(String[] args) {

		Dog d1 = new Dog("bobik", Breed.PITBULL, 6);
		Dog d2 = new Dog("BobIk", Breed.DOBERMAN, 12);
		Dog d3 = new Dog("murzik", Breed.SPANIEL, 10);

		System.out.println(d1.getBreed());
		System.out.println(d1.nameComparison(d2));
		System.out.println(d2.nameComparison(d3));

		System.out.println(oldestDog(d1, d2, d3));
	}
}
