package ua.ivanskyi.secondAndThirdTask;

import static org.junit.Assert.*;

import org.junit.Test;

public class TetsDog {

	@Test
	public void testNameComparison() {
		Dog d1 = new Dog("bobik", Breed.DOBERMAN, 5);
		Dog d2 = new Dog("BoBiK", Breed.SPANIEL, 8);

		assertTrue(d1.nameComparison(d2) == true);
	}

}
