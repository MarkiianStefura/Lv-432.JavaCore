package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void older() {
        Dog dog = new Dog("sirko",Breed.MOPS,12);
        Dog dogSecond = new Dog("Conor", Breed.BASTARDO,9);
        assertEquals(dog,Dog.older(dog,dogSecond));
    }

    @Test
    public void equalName() {
    }
}