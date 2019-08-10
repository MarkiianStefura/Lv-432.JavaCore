package Task_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDog {

	@Test
	void testEqualsNames() {
		Dog d1 = new Dog("Riko", Breed.SHARPEY, 7);
		Dog d2 = new Dog("Riko", Breed.GERMAN_SHEPHERD, 2);
		Dog d3 = new Dog("Rufus", Breed.HUSKIES, 4);
		assertEquals(true,Dog.equalsNames(d1, d2, d3));
	}

}
