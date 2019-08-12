package HomeWork4;

public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Aza", Breed.BOXER, 10);
		Dog dog2 = new Dog("Pork", Breed.BORZOI, 4);
		Dog dog3 = new Dog("Mack", Breed.BOLOGNESE, 8);
		if (dog1.equals(dog2) && dog1.equals(dog3)) {
			System.out.println(dog1.toString());
		}if (dog2.equals(dog3) && dog2.equals(dog1)) {
			System.out.println(dog2.toString());
		}if(dog3.equals(dog1)&& dog3.equals(dog1)) {
			System.out.println(dog3.toString());
		}
		
	}

}
