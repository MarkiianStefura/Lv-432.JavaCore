package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void isSameName() {
        Dog d1 = new Dog(11,Breed.MIXED_BREED,"Petro");
        Dog d2 = new Dog(11,Breed.MIXED_BREED,"Petro");

        assertEquals(true,Dog.isSameName(d1,d2));
    }

    @Test
    void oldestDog() {
        Dog d1 = new Dog(11,Breed.MIXED_BREED,"Petro");
        Dog d2 = new Dog(12,Breed.MIXED_BREED,"Petro");

        assertEquals(d2,Dog.oldestDog(d1,d2));
    }
}