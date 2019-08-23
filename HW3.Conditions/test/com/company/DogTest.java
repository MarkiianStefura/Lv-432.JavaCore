package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void isSameName() {
        Dog d1 = new Dog(11, Breed.MIXED_BREED, "Petro");
        Dog d2 = new Dog(11, Breed.MIXED_BREED, "Petro");

        assertTrue(Dog.isSameName(d1, d2));
    }

    @Test
    public void isSameName2() {
        Dog d1 = new Dog(11, Breed.MIXED_BREED, "Petro");
        Dog d2 = new Dog(11, Breed.MIXED_BREED, "NePetro");

        assertFalse(Dog.isSameName(d1, d2));
    }

    @Test
    public void isSameName3() {
        Dog d1 = new Dog(11, Breed.MIXED_BREED);
        Dog d2 = new Dog(11, Breed.MIXED_BREED, "Petro");

        assertFalse(Dog.isSameName(d1, d2));
    }

    @Test
    public void isSameName4() {
        Dog d1 = new Dog(11, Breed.MIXED_BREED, null);
        Dog d2 = new Dog(11, Breed.MIXED_BREED, null);

        assertTrue(Dog.isSameName(d1, d2));
    }

    @Test
    public void oldestDog() {
        Dog d1 = new Dog(11, Breed.MIXED_BREED, "Petro");
        Dog d2 = new Dog(12, Breed.MIXED_BREED, "Petro");

        assertEquals(d2, Dog.oldestDog(d1, d2));
    }

    @Test
    public void oldestDog2() {
        Dog d1 = new Dog(Breed.MIXED_BREED, "Sobaka");
        Dog d2 = new Dog(12, Breed.MIXED_BREED, "Petro");

        assertEquals(d2, Dog.oldestDog(d1, d2));
    }

    @Test
    public void oldestDog3() {
        Dog d1 = new Dog(Breed.MIXED_BREED, "Sobaka");
        Dog d2 = new Dog(Breed.MIXED_BREED, "Petro");

        assertEquals(d2, Dog.oldestDog(d1, d2));
    }
}