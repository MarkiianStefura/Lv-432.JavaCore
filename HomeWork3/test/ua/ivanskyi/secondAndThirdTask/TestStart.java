package ua.ivanskyi.secondAndThirdTask;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStart {

	@Test
	public void testOldestDog() {
		Dog d1 = new Dog("bobik", Breed.PITBULL, 6);
		Dog d2 = new Dog("BobIk", Breed.DOBERMAN, 12);
		Dog d3 = new Dog("murzik", Breed.SPANIEL, 10);

		assertTrue(Start.oldestDog(d1, d2, d3) == d2);

	}

}
